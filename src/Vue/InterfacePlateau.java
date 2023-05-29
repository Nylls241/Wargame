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

    private JPanel panelPlateau; // Panel pour le plateau de jeu

    /**
     * Constructeur de la classe InterfacePlateau.
     */
    public InterfacePlateau() {
        // Configuration de la fenêtre
        setTitle("Plateau de jeu : WarGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Création du panel pour le plateau de jeu
        panelPlateau = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dessinez la texture du plateau en utilisant une image
                try {
                    BufferedImage plateauImg = ImageIO.read(new File("plateau.png"));
                    g.drawImage(plateauImg, 0, 0, null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        panelPlateau.setPreferredSize(new Dimension(1280, 720)); // Définissez la taille souhaitée du plateau
        add(panelPlateau);

        pack(); // Ajuster la taille de la fenêtre aux dimensions des composants
    }
    
   
}
