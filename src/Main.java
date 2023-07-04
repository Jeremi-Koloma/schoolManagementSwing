import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Construction de la fenetre
        JFrame fenetre = new JFrame("Formulaire d'inscription");
        // Ajout d'un panneau à la fenetre
        fenetre.setContentPane(new LoginForm());
        // Pour que le programme ne tourne pas en arrière plan
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(null);
        // pour que le contenu s'adapte à son container
        fenetre.pack();
        // taille de la fenetre
        fenetre.setLocationRelativeTo(null); // pour centrer la fenetre au milieu de screen
        //fenetre.setLocation(100, 100);
        // on rend la fenêtre visible
        fenetre.setVisible(true);
    }
}