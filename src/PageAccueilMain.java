import javax.swing.*;
import java.awt.*;


public class PageAccueilMain extends JFrame{
    public PageAccueilMain() {
        this.setTitle("Page d'accueil");
        //Ajout d'un panneaux à la fenetre
        this.setContentPane(new PageAccueilForm());
        // Pour que le programme ne tourne pas en arrière plan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        // pour que le contenu s'adapte à son container
        this.pack();
        // taille de la fenetre
        //fenetreAccueil.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        this.setLocation(300, 100);
        // on rend la fenêtre visible
        this.setVisible(true);
    }


}
