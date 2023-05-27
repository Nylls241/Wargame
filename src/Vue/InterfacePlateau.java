package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Classe représentant l'interface graphique du plateau de jeu de guerre.
 */
public class InterfacePlateau extends JFrame {

    JFrame frame;
    JLabel displayField;
    ImageIcon image;

    /**
     * Constructeur de la classe InterfacePlateau.
     */
    public InterfacePlateau() {
        // Configuration de la fenêtre
        frame = new JFrame("Plateau de jeu : WarGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Dessinez la texture du plateau en utilisant une image
            
        try {
            image = new ImageIcon(getClass().getResource("../textures/plateau.png"));
            displayField = new JLabel(image);
            frame.add(displayField);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("image non trouvé");
        }
            
            frame.pack();
            frame.setVisible(true);

    }
    
   
}
