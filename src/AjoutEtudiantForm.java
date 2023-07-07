import javax.swing.*;
import java.awt.*;

public class AjoutEtudiantForm extends JPanel {
    JFrame fenetreFormEtudiant = new JFrame();
    JTextField inputNmatricule = new JTextField(15);
    JTextField inputNomEtudiant = new JTextField(15);
    JTextField inputPrenomEtudiant = new JTextField(15);
    JTextField inputAddressEtudiant = new JTextField(15);
    JTextField inputEmailEtudiant = new JTextField(15);
    JTextField inputTelephoneEtudiant = new JTextField(15);

    JButton btnAjouterEtudiant = new JButton("Ajouter l'Étudiant");

    public AjoutEtudiantForm(){
        this.setPreferredSize( new Dimension( 700, 620) );
        this.setBackground(Color.WHITE);

        // Titre du formulaire
        JLabel TitreForm = new JLabel("Nouveau Étudiant");
        TitreForm.setForeground(new Color(0x0092CE));
        TitreForm.setFont(new Font("Arial",Font.PLAIN, 37));
        TitreForm.setHorizontalAlignment(JLabel.CENTER);
        TitreForm.setBounds(95,-100, 450, 300);

        // Label N°matricul
        JLabel nomNmatricul = new JLabel("N° matricule");
        nomNmatricul.setBounds(70,98, 250, 50);
        inputNmatricule.setBounds(70,132, 250, 50);

        // Label Nom
        JLabel nomEtudiant = new JLabel("Nom");
        nomEtudiant.setBounds(70,183, 250, 50);
        inputNomEtudiant.setBounds(70,220, 250, 50);

        // Label Prenom
        JLabel prenomEtudiant = new JLabel("Prénom");
        prenomEtudiant.setBounds(70,273, 250, 50);
        inputPrenomEtudiant.setBounds(70,308, 250, 50);

        // Label Address
        JLabel addressEtudiant = new JLabel("Adresse");
        addressEtudiant.setBounds(70,363, 250, 50);
        inputAddressEtudiant.setBounds(70,396, 250, 50);

        // Label email
        JLabel emailEtudiant = new JLabel("Email");
        emailEtudiant.setBounds(380,98, 250, 50);
        inputEmailEtudiant.setBounds(380,132, 250, 50);

        // Label Nom
        JLabel telephoneEtudiant = new JLabel("Téléphone");
        telephoneEtudiant.setBounds(380,183, 250, 50);
        inputTelephoneEtudiant.setBounds(380,220, 250, 50);

        // Bouton ajouter Etudiant
        ImageIcon iconAdd = new ImageIcon("src/images/icon-add.png");
        btnAjouterEtudiant.setIcon(iconAdd);
        btnAjouterEtudiant.setBackground(new Color(0x0FB05A));
        btnAjouterEtudiant.setBounds(160, 500, 320, 50);
        btnAjouterEtudiant.setForeground(new Color(0xFFFFFF));
        btnAjouterEtudiant.setOpaque(true);
        btnAjouterEtudiant.setFocusable(false);
        btnAjouterEtudiant.setBorderPainted(false);










        // Ajout au panneau
        this.add(btnAjouterEtudiant);
        // Ajout au panneau
        this.add(telephoneEtudiant);
        // Ajout au panneau
        this.add(inputTelephoneEtudiant);
        // Ajout au panneau
        this.add(emailEtudiant);
        // Ajout au panneau
        this.add(inputEmailEtudiant);
        // Ajout au panneau
        this.add(addressEtudiant);
        // Ajout au panneau
        this.add(inputAddressEtudiant);
        // Ajout au panneau
        this.add(prenomEtudiant);
        // Ajout au panneau
        this.add(inputPrenomEtudiant);
        // Ajout au panneau
        this.add(nomEtudiant);
        // Ajout au panneau
        this.add(inputNomEtudiant);
        // Ajout au panneau
        this.add(inputNmatricule);
        // Ajout au panneau
        this.add(nomNmatricul);
        // Ajout du titre au panneau
        this.add(TitreForm);



        // Nom du fenêtre
        fenetreFormEtudiant.setTitle("Formulaire ajout Etudiant");
        // Ajout d'un panneaux à la fenetre
        fenetreFormEtudiant.setContentPane(this);
        // Desactivé le layout pardefaut
        fenetreFormEtudiant.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreFormEtudiant.pack();
        // taille de la fenetre
        fenetreFormEtudiant.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //this.setLocation(300, 100);
        // on rend la fenêtre visible
        fenetreFormEtudiant.setVisible(true);

    }


}
