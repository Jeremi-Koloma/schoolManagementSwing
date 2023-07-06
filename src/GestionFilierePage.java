import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GestionFilierePage extends JPanel {

    JFrame fenetreFiliere = new JFrame();

    JButton btnAjoutFiliere = new JButton("Ajouter une Filière");
    JButton btnModifierFiliere = new JButton("Modifier une Filière");
    JButton btnListFiliere = new JButton("Liste des Filières");
    JButton btnSupprimerFiliere = new JButton("Supprimer une Filière");

    Image bigIconCenter;

    public GestionFilierePage(){
        this.setPreferredSize( new Dimension( 650, 450) );
        //setBounds(0, 0, 250, 250);
        this.setBackground(Color.WHITE);


        // Titre du formulaire
        JLabel gestionFiliereTitre = new JLabel("GESTION DES FILIÈRES");
        gestionFiliereTitre.setForeground(new Color(0x0092CE));
        gestionFiliereTitre.setFont(new Font("Arial",Font.PLAIN, 37));
        gestionFiliereTitre.setHorizontalAlignment(JLabel.CENTER);
        gestionFiliereTitre.setBounds(95,-100, 450, 300);

        // Bouton ajouter Filière
        ImageIcon iconAdd = new ImageIcon("src/images/icon-add.png");
        btnAjoutFiliere.setIcon(iconAdd);
        btnAjoutFiliere.setBackground(new Color(0x0FB05A));
        btnAjoutFiliere.setBounds(20, 100, 300, 50);
        btnAjoutFiliere.setForeground(new Color(0xFFFFFF));
        btnAjoutFiliere.setOpaque(true);
        btnAjoutFiliere.setFocusable(false);
        btnAjoutFiliere.setBorderPainted(false);


        // Bouton modifier Filière
        ImageIcon iconEdit = new ImageIcon("src/images/icon-edit.png");
        btnModifierFiliere.setIcon(iconEdit);
        btnModifierFiliere.setBackground(new Color(0xD16A21));
        btnModifierFiliere.setBounds(20, 170, 300, 50);
        btnModifierFiliere.setForeground(new Color(0xFFFFFF));
        btnModifierFiliere.setOpaque(true);
        btnModifierFiliere.setFocusable(false);
        btnModifierFiliere.setBorderPainted(false);

        // Bouton liste Filière
        ImageIcon iconList = new ImageIcon("src/images/icon-list.png");
        btnListFiliere.setIcon(iconList);
        btnListFiliere.setBackground(new Color(0x0283B9));
        btnListFiliere.setBounds(20, 240, 300, 50);
        btnListFiliere.setForeground(new Color(0xFFFFFF));
        btnListFiliere.setOpaque(true);
        btnListFiliere.setFocusable(false);
        btnListFiliere.setBorderPainted(false);

        // Bouton suppression Filière
        ImageIcon iconDelete = new ImageIcon("src/images/icon-delete.png");
        btnSupprimerFiliere.setIcon(iconDelete);
        btnSupprimerFiliere.setBackground(new Color(0xCA3313));
        btnSupprimerFiliere.setBounds(20, 313, 300, 50);
        btnSupprimerFiliere.setForeground(new Color(0xFFFFFF));
        btnSupprimerFiliere.setOpaque(true);
        btnSupprimerFiliere.setFocusable(false);
        btnSupprimerFiliere.setBorderPainted(false);

        // Grande image icon
        try {
            bigIconCenter = ImageIO.read(new File("src/images/big-icon-filiere.png"));
        }
        catch(IOException ioException) {
            ioException.printStackTrace();
        }












        // Ajout du bouton suppression filière au panneau
        this.add(btnSupprimerFiliere);
        // Ajout du bouton liste filière au panneau
        this.add(btnListFiliere);
        // Ajout du bouton modifier filière au panneau
        this.add(btnModifierFiliere);
        // Ajout du bouton ajout filière au panneau
        this.add(btnAjoutFiliere);
        // Ajout du titre de la page au panneau
        this.add(gestionFiliereTitre);



        // Nom du fenêtre
        fenetreFiliere.setTitle("Page Gestion Filière");
        // Ajout d'un panneaux à la fenetre
        fenetreFiliere.setContentPane(this);
        // Desactivé le layout pardefaut
        fenetreFiliere.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetreFiliere.pack();
        // taille de la fenetre
        fenetreFiliere.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //this.setLocation(300, 100);
        // on rend la fenêtre visible
        fenetreFiliere.setVisible(true);
    }



    //
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(bigIconCenter, 360, 100, 250, 250, this);


    }
}
