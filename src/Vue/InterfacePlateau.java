package Vue;

import javax.swing.*;
import java.awt.*;

/**
 * Classe représentant l'interface graphique du plateau de jeu de guerre.
 */
public class InterfacePlateau extends JFrame {

    private JFrame frame;
    private JLabel displayField;
    private ImageIcon image;

    /**
     * Constructeur de la classe InterfacePlateau.
     */
    public InterfacePlateau() {
        // Configuration de la fenêtre
        frame = new JFrame("Plateau de jeu : WarGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Création d'un panneau pour contenir l'image
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1280, 720)); // Ajustez la taille selon vos besoins

        // Dessinez la texture du plateau en utilisant une image
        try {
            image = new ImageIcon(getClass().getResource("../textures/plateau1.png"));
            displayField = new JLabel(image);
            panel.add(displayField);
        } catch (Exception e) {
            System.out.println("image non trouvée");
        }

        // Création d'un composant JScrollPane pour permettre le défilement
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.setContentPane(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }


}
