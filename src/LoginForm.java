import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginForm extends JPanel implements ActionListener {
    // Décarations des variables

    JTextField usernameInput = new JTextField(15);
    JPasswordField passwordInput = new JPasswordField(15);
    JButton loginButton = new JButton("Se connecter");

    // Création de la fénêtre
    JFrame fenetreLogin = new JFrame("Formulaire d'Authentification");


    public LoginForm() {

        // Titre du Formulaire
        JLabel titreForm = new JLabel("LOGIN");
        ImageIcon iconLogTitre = new ImageIcon("src/images/log.png");
        titreForm.setIcon(iconLogTitre);
        titreForm.setForeground(new Color(0x0092CE));
        titreForm.setFont(new Font("Arial",Font.PLAIN, 37));
        titreForm.setBounds(170,-70, 300, 300);


        // Username Field
        JLabel usernameField = new JLabel("Nom d'utilisateur");
        ImageIcon iconUser = new ImageIcon("src/images/user.png");
        usernameField.setBounds(100,132, 300, 50);
        usernameField.setIcon(iconUser);
        usernameInput.setBounds(100,170, 300, 50);

        // Password Field
        JLabel passwordField = new JLabel("Mots de passe*");
        ImageIcon iconPassword = new ImageIcon("src/images/password.png");
        //passwordField.setForeground(new Color(0xFFFFFF));
        passwordField.setBounds(100,215, 300, 50);
        passwordField.setIcon(iconPassword);
        passwordInput.setBounds(100,250, 300, 50);

        // Login Button
        loginButton.setBackground(new Color(0x0092CE));
        loginButton.setBounds(100,350, 300, 50);
        loginButton.setForeground(new Color(0xFFFFFF));
        loginButton.setOpaque(true);
        loginButton.setBorderPainted(false);
        loginButton.setFocusable(false);
        // Plaçons un écouteur au bouton login
        loginButton.addActionListener(this);


        // Text Copyright
        JLabel textCopyRight = new JLabel("©IUT-2023 Tous droit reservé");
        textCopyRight.setHorizontalAlignment(JLabel.CENTER);
        textCopyRight.setBounds(100,400, 300, 50);




        // Ajouter du titre Formulaire au panneau
        this.add(titreForm);

        // Ajouter username infos au panneau
        this.add(usernameField);
        this.add(usernameInput);

        // Ajouter password infos au panneau
        this.add(passwordField);
        this.add(passwordInput);

        // Ajouter du bouton login au panneau
        this.add(loginButton);

        // Ajout du copyRight au panneau
        this.add(textCopyRight);





        setPreferredSize( new Dimension( 500, 500) );
        //setBounds(0, 0, 250, 250);
        setBackground(Color.WHITE);
        // Ajout d'un panneau à notre fenêtre
        fenetreLogin.setContentPane(this);
        // Pour que le programme ne tourne pas en arrière plan
        fenetreLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreLogin.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreLogin.pack();
        // taille de la fenetre
        fenetreLogin.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        // on rend la fenêtre visible
        fenetreLogin.setVisible(true);
    }





    // traitement du logique
    @Override
    public void actionPerformed(ActionEvent event) {
        // Gettons le boutton Login
        if (event.getSource() == loginButton){
            // vérifions le nom d'utilisateur ou le mots de passe ne sont pas vide
            if (usernameInput.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Nom d'utilisateur obligatoire !","Attention !",JOptionPane.WARNING_MESSAGE);
                System.out.println("--- Username is required !---");
            }else if (passwordInput.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Mots de passe obligatoire !","Attention !",JOptionPane.WARNING_MESSAGE);
                System.out.println("--- Password is required !---");
            } else if (!usernameInput.getText().equals("") && !passwordInput.getText().equals("")){
                try {
                    // Ouverture de la connexion
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiant?characterEncoding=latin1&useConfigs=maxPerformance","root","70951335");

                    // Acceptation de username et de mots de passe
                    // Récupérons les infos
                    String username = usernameInput.getText();
                    String password = String.valueOf(passwordInput.getPassword());

                    Statement statement = connection.createStatement();
                    // Exécution de la requête SQL
                    String sql = "select * from gestionetudiant.login where username ='"+username+"' and password='"+password+"'";
                    ResultSet resultSet = statement.executeQuery(sql);

                    if(resultSet.next()){
                        // Si le username et le mots de passe sont correcte, on l'envoie à la page d'accueil
                        // Femeture de la fenêtre login
                        fenetreLogin.dispose();
                        // Overture de la page d'Accueil
                        PageAccueilMain pageAccueilMain =  new PageAccueilMain();
                        System.out.println("----- Connexion Reussi ---");

                    } else {
                        System.out.println("----- Connexion Non Reussi ---");
                        // on renitialise les valeurs dans champs input
                        usernameInput.setText("");
                        passwordInput.setText("");
                        JOptionPane.showMessageDialog(null,"Mots de passe ou nom d'utilisateur incorrect !","Erreur !",JOptionPane.ERROR_MESSAGE);

                    }

                    // Fermeture de la requête
                    connection.close();

                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }








        }
    }
}
