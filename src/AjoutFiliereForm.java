import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class AjoutFiliereForm extends JPanel implements ActionListener {

    // Création de la fenêtre
    JFrame fenetreFormAjoutFiliere = new JFrame();

    JTextField nomFiliereInput = new JTextField(15);

    JButton btnAjouterFiliere = new JButton("Ajouter la Filière");

    public AjoutFiliereForm(){
        this.setPreferredSize( new Dimension( 480, 310) );
        this.setBackground(Color.WHITE);

        // Titre du formulaire
        JLabel titreFomulaire = new JLabel("Ajouter une Filière");
        titreFomulaire.setForeground(new Color(0x0092CE));
        titreFomulaire.setFont(new Font("Arial",Font.PLAIN, 37));
        titreFomulaire.setBounds(90,35, 400, 50);

        // champ ajout nom filiere
        JLabel nomFiliereField = new JLabel("Nom filière");
        nomFiliereField.setBounds(90,98, 300, 50);
        nomFiliereInput.setBounds(90,132, 300, 50);


        // Boutons ajouter la filiere
        btnAjouterFiliere.setBackground(new Color(0x0092CE));
        btnAjouterFiliere.setBounds(90,200, 300, 50);
        btnAjouterFiliere.setForeground(new Color(0xFFFFFF));
        btnAjouterFiliere.setOpaque(true);
        btnAjouterFiliere.setBorderPainted(false);
        btnAjouterFiliere.setFocusable(false);
        // Plaçons un écouteur au bouton ajout
        btnAjouterFiliere.addActionListener(this);


        //Ajout du bouton ajouter la filiere au panneau
        this.add(btnAjouterFiliere);
        // Ajout du text nom filiere au panneau
        this.add(nomFiliereField);
        // Ajout du nomFiliereInput au panneau
        this.add(nomFiliereInput);
        // Ajout du titre au panneau
        this.add(titreFomulaire);


        // propriétés de la fenêtre
        fenetreFormAjoutFiliere.setTitle("Formulaire Ajout Filière");
        // Ajout d'un panneaux à la fenetre
        fenetreFormAjoutFiliere.setContentPane(this);
        // Desactivé le layout pardefaut
        fenetreFormAjoutFiliere.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreFormAjoutFiliere.pack();
        // taille de la fenetre
        fenetreFormAjoutFiliere.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //this.setLocation(300, 100);
        // on rend la fenêtre visible
        fenetreFormAjoutFiliere.setVisible(true);
    }




    // Traitement Logique
    @Override
    public void actionPerformed(ActionEvent event) {
        // Géttons le bouton Ajouter du formulaire
       if (event.getSource() == btnAjouterFiliere){
           // Vérifions si le champs de saisi n'est pas vide
           if (nomFiliereInput.getText().equals("") || nomFiliereInput.getText().isEmpty()){
               JOptionPane.showMessageDialog(null,"Nom filière obligatoire !","Attention !",JOptionPane.WARNING_MESSAGE);
               System.out.println("--- Nom filière is required !---");
           } else if (!nomFiliereInput.equals("") && !nomFiliereInput.getText().isEmpty()){
               // Traitement de la base
               try {
                   // Ouverture de la connexion avec la base de donnée
                   Class.forName( "com.mysql.jdbc.Driver");
                   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiant?characterEncoding=latin1&useConfigs=maxPerformance","root","70951335");

                   // Recupération de l'input nom filière
                   String nomfiliere = nomFiliereInput.getText();

                   Statement statement = connection.createStatement();

                   // Préparation de la requête SQL
                   String sql = "INSERT INTO gestionetudiant.filiere (nomfiliere)" + "VALUES(?)" ;

                   PreparedStatement preparedStatement = connection.prepareStatement(sql);
                   preparedStatement.setString(1,nomfiliere);

                   // Exécution de la requête et Insertion de la ligne dans la table
                   int ajoutLigne = preparedStatement.executeUpdate();
                   if (ajoutLigne > 0){
                       // Créons une instance de notre classe Filiere propriété
                       FiliereAttributs filiereAttributs = new FiliereAttributs();
                       filiereAttributs.nomFiliere = nomfiliere;
                   }

                   // Fermeture de la connexion
                   statement.close();
                   connection.close();

                   // Reinitalisation des valeurs dans le champs input
                   nomFiliereInput.setText("");
                   // Message de confirmation à l'utilisateur
                   JOptionPane.showMessageDialog(null,"Filière ajouter !","succès !",JOptionPane.INFORMATION_MESSAGE);

               } catch (Exception e){
                   e.printStackTrace();
               }

           }

       }






    }
}
