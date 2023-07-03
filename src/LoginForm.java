import javax.swing.*;
import java.awt.*;

public class LoginForm extends JPanel {
    public LoginForm() {
        setPreferredSize( new Dimension( 500, 500) );
        setBounds(0, 0, 250, 250);
        setBackground(Color.WHITE);
        //setBackground( new Color(0x197887));


        // Titre du Formulaire
        JLabel titreForm = new JLabel("LOGIN");
        //titreForm.setForeground(new Color(0xFFFFFF));
        titreForm.setFont(new Font("Arial",Font.PLAIN, 37));
        titreForm.setBounds(180,-70, 300, 300);


        // Username Field
        JLabel usernameField = new JLabel("Nom d'utilisateur");
        //usernameField.setForeground(new Color(0xFFFFFF));
        usernameField.setBounds(100,135, 300, 50);
        JTextField usernameInput = new JTextField(15);
        usernameInput.setBounds(100,170, 300, 50);

        // Password Field
        JLabel passwordField = new JLabel("Mots de passe*");
        //passwordField.setForeground(new Color(0xFFFFFF));
        passwordField.setBounds(100,215, 300, 50);
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(100,250, 300, 50);

        // Login Button
        JButton loginButton = new JButton("Se connecter");
        loginButton.setBounds(100,350, 300, 50);
        //loginButton.setForeground(new Color(0xD91E1E));
        loginButton.setBackground(Color.BLUE);




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
    }
}
