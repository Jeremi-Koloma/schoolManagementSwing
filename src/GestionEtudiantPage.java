import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEtudiantPage extends JPanel implements ActionListener {
    JFrame fenetreGestionEtudiant = new JFrame();

    JButton btnAjoutEtudiant = new JButton("Ajouter un Étudiant");
    JButton btnModifierEtudiant = new JButton("Modifier un Étudiant");
    JButton btnListEtudiant = new JButton("Liste des Étudiants");
    JButton btnSupprimerEtudiant = new JButton("Supprimer un Étudiant");

    public GestionEtudiantPage(){
        this.setPreferredSize( new Dimension( 650, 450) );
        this.setBackground(Color.WHITE);

        // Titre du formulaire
        JLabel gestionEtudiantTitre = new JLabel("GESTION DES ÉTUDIANTS");
        gestionEtudiantTitre.setForeground(new Color(0x0092CE));
        gestionEtudiantTitre.setFont(new Font("Arial",Font.PLAIN, 37));
        gestionEtudiantTitre.setHorizontalAlignment(JLabel.CENTER);
        gestionEtudiantTitre.setBounds(88,-100, 500, 300);

        // Bouton ajouter Etudiant
        ImageIcon iconAdd = new ImageIcon("src/images/icon-add.png");
        btnAjoutEtudiant.setIcon(iconAdd);
        btnAjoutEtudiant.setBackground(new Color(0x0FB05A));
        btnAjoutEtudiant.setBounds(20, 100, 300, 50);
        btnAjoutEtudiant.setForeground(new Color(0xFFFFFF));
        btnAjoutEtudiant.setOpaque(true);
        btnAjoutEtudiant.setFocusable(false);
        btnAjoutEtudiant.setBorderPainted(false);
        btnAjoutEtudiant.addActionListener(this);

        // Bouton modifier Etudiant
        ImageIcon iconEdit = new ImageIcon("src/images/icon-edit.png");
        btnModifierEtudiant.setIcon(iconEdit);
        btnModifierEtudiant.setBackground(new Color(0xD16A21));
        btnModifierEtudiant.setBounds(20, 170, 300, 50);
        btnModifierEtudiant.setForeground(new Color(0xFFFFFF));
        btnModifierEtudiant.setOpaque(true);
        btnModifierEtudiant.setFocusable(false);
        btnModifierEtudiant.setBorderPainted(false);

        // Bouton liste des Etudiants
        ImageIcon iconList = new ImageIcon("src/images/icon-list.png");
        btnListEtudiant.setIcon(iconList);
        btnListEtudiant.setBackground(new Color(0x0283B9));
        btnListEtudiant.setBounds(20, 240, 300, 50);
        btnListEtudiant.setForeground(new Color(0xFFFFFF));
        btnListEtudiant.setOpaque(true);
        btnListEtudiant.setFocusable(false);
        btnListEtudiant.setBorderPainted(false);

        // Bouton suppression Etudiant
        ImageIcon iconDelete = new ImageIcon("src/images/icon-delete.png");
        btnSupprimerEtudiant.setIcon(iconDelete);
        btnSupprimerEtudiant.setBackground(new Color(0xCA3313));
        btnSupprimerEtudiant.setBounds(20, 313, 300, 50);
        btnSupprimerEtudiant.setForeground(new Color(0xFFFFFF));
        btnSupprimerEtudiant.setOpaque(true);
        btnSupprimerEtudiant.setFocusable(false);
        btnSupprimerEtudiant.setBorderPainted(false);














        // ajout du bouton au panneau
        this.add(btnSupprimerEtudiant);
        // ajout du bouton au panneau
        this.add(btnListEtudiant);
        // ajout du bouton au panneau
        this.add(btnModifierEtudiant);
        // ajout du bouton au panneau
        this.add(btnAjoutEtudiant);
        // Ajout du titre au panneau
        this.add(gestionEtudiantTitre);



        // Nom du fenêtre
        fenetreGestionEtudiant.setTitle("Page Gestion Etudiant");
        // Ajout d'un panneaux à la fenetre
        fenetreGestionEtudiant.setContentPane(this);
        // fenetreGestionEtudiant le layout pardefaut
        fenetreGestionEtudiant.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreGestionEtudiant.pack();
        // taille de la fenetre
        fenetreGestionEtudiant.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        // on rend la fenêtre visible
        fenetreGestionEtudiant.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent event) {
        // Gettons le bouton ajout etudiant
        if (event.getSource() == btnAjoutEtudiant){
            // Ouverture formulaire ajout
            AjoutEtudiantForm ajoutEtudiantForm = new AjoutEtudiantForm();
        }

    }
}
