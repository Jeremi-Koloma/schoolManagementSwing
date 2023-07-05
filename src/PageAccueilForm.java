import javax.swing.*;
import java.awt.*;

public class PageAccueilForm extends JPanel {

    // Créons une fenêtre
    JFrame fenetreAccueilForm = new JFrame();

    // Bouton de Gesions
    JButton gestionFiliere = new JButton("Gestion Filière");
    JButton gestionMatiere = new JButton("Gestion Matière");
    JButton gestionEtudiant = new JButton("Gestion Étudiant");


    public PageAccueilForm() {
        this.setPreferredSize( new Dimension( 900, 600) );
        //setBounds(0, 0, 250, 250);
        this.setBackground(Color.WHITE);

        // créons la bare de Menu
        JMenuBar menuBar = new JMenuBar();
        // Le Menu
        JMenu fichier = new JMenu("Fichier");
        JMenu edition = new JMenu("Édition");
        JMenu filiere = new JMenu("Filière");
        JMenu etudiant = new JMenu("Étudiant");
        JMenu matiere = new JMenu("Matière");
        JMenu apropos = new JMenu("À propos");







        // Ajoutons du bouton gestion Filiere au panneau
        this.add(gestionFiliere);
        ImageIcon iconFiliere = new ImageIcon("src/images/icon-filiere.png");
        gestionFiliere.setIcon(iconFiliere);
        gestionFiliere.setBackground(new Color(0x046C7C));
        gestionFiliere.setBounds(20, 100, 300, 50);
        gestionFiliere.setForeground(new Color(0xFFFFFF));
        gestionFiliere.setOpaque(true);
        gestionFiliere.setBorderPainted(false);
        gestionFiliere.setFocusable(false);

        // Ajoutons du bouton gestion Matiere au panneau
        this.add(gestionMatiere);
        ImageIcon iconMatiere = new ImageIcon("src/images/icon_matiere.png");
        gestionMatiere.setIcon(iconMatiere);
        gestionMatiere.setBackground(new Color(0x017BAD));
        gestionMatiere.setBounds(20, 200, 300, 50);
        gestionMatiere.setForeground(new Color(0xFFFFFF));
        gestionMatiere.setOpaque(true);
        gestionMatiere.setBorderPainted(false);
        gestionMatiere.setFocusable(false);

        // Ajoutons du bouton gestion Etudiant au panneau
        this.add(gestionEtudiant);
        ImageIcon iconEtudiant = new ImageIcon("src/images/icon-etudiant.png");
        gestionEtudiant.setIcon(iconEtudiant);
        gestionEtudiant.setBackground(new Color(0xD3691F));
        gestionEtudiant.setBounds(20, 300, 300, 50);
        gestionEtudiant.setForeground(new Color(0xFFFFFF));
        gestionEtudiant.setOpaque(true);
        gestionEtudiant.setBorderPainted(false);
        gestionEtudiant.setFocusable(false);







        // Ajoutons la liste de Menu
        menuBar.add(fichier);
        menuBar.add(edition);
        menuBar.add(filiere);
        menuBar.add(etudiant);
        menuBar.add(matiere);
        menuBar.add(apropos);


        // Nom du fenêtre
        fenetreAccueilForm.setTitle("Page d'Accueil");
        // Ajoutons la barre du menu à la fenêtre
        fenetreAccueilForm.setJMenuBar(menuBar);
        // Ajout d'un panneaux à la fenetre
        fenetreAccueilForm.setContentPane(this);
        // Pour que le programme ne tourne pas en arrière plan
        fenetreAccueilForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetreAccueilForm.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreAccueilForm.pack();
        // taille de la fenetre
        fenetreAccueilForm.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //this.setLocation(300, 100);
        // on rend la fenêtre visible
        fenetreAccueilForm.setVisible(true);
    }
}
