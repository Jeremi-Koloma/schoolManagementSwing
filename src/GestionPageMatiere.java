import javax.swing.*;
import java.awt.*;

public class GestionPageMatiere extends JPanel {
    // Creation de la fenetre
    JFrame fenetreGestionPageMatiere = new JFrame();

    // bouton ajout matiere
    JButton btnAjoutMatiere = new JButton("Ajouter une matière");

    public GestionPageMatiere(){
        this.setPreferredSize( new Dimension( 650, 450) );
        this.setBackground(Color.WHITE);


        // Le Titre de la page
        JLabel titrePage = new JLabel("GESTION DES MATIERES");
        titrePage.setForeground(new Color(0x0092CE));
        titrePage.setFont(new Font("Arial",Font.PLAIN, 37));
        titrePage.setBounds(92,-100, 500, 300);

        // le bouton Ajout matière
        ImageIcon iconAdd = new ImageIcon("src/images/icon-add.png");
        btnAjoutMatiere.setIcon(iconAdd);
        btnAjoutMatiere.setBackground(new Color(0x0FB05A));
        btnAjoutMatiere.setBounds(20, 100, 300, 50);
        btnAjoutMatiere.setForeground(new Color(0xFFFFFF));
        btnAjoutMatiere.setOpaque(true);
        btnAjoutMatiere.setFocusable(false);
        btnAjoutMatiere.setBorderPainted(false);








        // Ajout du bouton au panneau
        this.add(btnAjoutMatiere);
        // Ajout du titre au panneau
        this.add(titrePage);





        // Nom du fenêtre
        fenetreGestionPageMatiere.setTitle("Page Gestion Filière");
        // Ajout d'un panneaux à la fenetre
        fenetreGestionPageMatiere.setContentPane(this);
        // Desactivé le layout pardefaut
        fenetreGestionPageMatiere.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreGestionPageMatiere.pack();
        // taille de la fenetre
        fenetreGestionPageMatiere.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        // on rend la fenêtre visible
        fenetreGestionPageMatiere.setVisible(true);
    }





}
