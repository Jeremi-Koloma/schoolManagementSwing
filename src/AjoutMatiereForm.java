import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AjoutMatiereForm extends JPanel implements ActionListener {
    // Création de la fenêtre
    JFrame fenetreFormAjoutMatiere = new JFrame();

    JTextField inputNomMatiere = new JTextField(15);

    JButton btnAjouterMatiere = new JButton("Ajouter la matière");

    public AjoutMatiereForm(){
        this.setPreferredSize( new Dimension( 480, 310) );
        this.setBackground(Color.WHITE);




        // Le titre du formulaire
        JLabel titrFormulaire = new JLabel("Ajouter une matière");
        titrFormulaire.setForeground(new Color(0x0092CE));
        titrFormulaire.setFont(new Font("Arial",Font.PLAIN, 37));
        titrFormulaire.setBounds(88,35, 400, 50);


        // le nom du label
        JLabel nomMatireText = new JLabel("Nom de la matière");
        nomMatireText.setBounds(90,98, 300, 50);
        inputNomMatiere.setBounds(90,132, 300, 50);

        // le bouton ajout matière
        btnAjouterMatiere.setBackground(new Color(0x0092CE));
        btnAjouterMatiere.setBounds(90,200, 300, 50);
        btnAjouterMatiere.setForeground(new Color(0xFFFFFF));
        btnAjouterMatiere.setOpaque(true);
        btnAjouterMatiere.setBorderPainted(false);
        btnAjouterMatiere.setFocusable(false);
        btnAjouterMatiere.addActionListener(this);










        // ajout du bouton au panneau
        this.add(btnAjouterMatiere);
        // Ajout du textField
        this.add(inputNomMatiere);
        // Ajout du text au panneau
        this.add(nomMatireText);
        // Ajout du titre au panneau
        this.add(titrFormulaire);




        // propriétés de la fenêtre
        fenetreFormAjoutMatiere.setTitle("Formulaire Ajout Matière");
        // Ajout d'un panneaux à la fenetre
        fenetreFormAjoutMatiere.setContentPane(this);
        // Desactivé le layout pardefaut
        fenetreFormAjoutMatiere.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreFormAjoutMatiere.pack();
        // taille de la fenetre
        fenetreFormAjoutMatiere.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //this.setLocation(300, 100);
        // on rend la fenêtre visible
        fenetreFormAjoutMatiere.setVisible(true);
    }



    // Traitement

    @Override
    public void actionPerformed(ActionEvent event) {
        // gettons le bouton ajouter matière
        if (event.getSource() == btnAjouterMatiere){
           // Vérifions si le champs n'est pas vide
            if (inputNomMatiere.getText().equals("") || inputNomMatiere.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Nom de la matière obligatoire !","Attention !",JOptionPane.WARNING_MESSAGE);
            } else if (!inputNomMatiere.getText().equals("")){

                // Traitement avec la base de donnee
                try {
                    // Ouverture de la connexion avec la base de donnée
                    Class.forName( "com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiant?characterEncoding=latin1&useConfigs=maxPerformance","root","70951335");

                    // Recupération de l'input le champs saisi par l'utilisateur
                    String nommatiere = inputNomMatiere.getText();

                    Statement statement = connection.createStatement();

                    // Préparation de la requête SQL
                    String sql = "INSERT INTO gestionetudiant.matiere (matiere)" + "VALUES(?)" ;

                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1,nommatiere);

                    // Exécution de la requête et Insertion de la ligne dans la table
                    int ajoutLigne = preparedStatement.executeUpdate();
                    if (ajoutLigne > 0){
                        // Créons une instance de notre classe Matière propriété
                        MatiereAttributs matiereAttributs = new MatiereAttributs();
                        matiereAttributs.nomMatiere = nommatiere;
                    }

                    // Fermeture de la connexion
                    statement.close();
                    connection.close();

                    // Reinitalisation des valeurs dans le champs input
                    inputNomMatiere.setText("");
                    // Message de confirmation à l'utilisateur
                    JOptionPane.showMessageDialog(null,"Matière ajouter !","succès !",JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }
}
