package Vue;
import javax.swing.*;
import java.awt.*;

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
        setTitle("Plateau de Jeu de Guerre");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Création du panel pour le plateau de jeu
        panelPlateau = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dessinez les textures du plateau ici en utilisant les méthodes graphiques
            }
        };
        panelPlateau.setPreferredSize(new Dimension(800, 600)); // Définissez la taille souhaitée du plateau
        add(panelPlateau);

        pack(); // Ajuster la taille de la fenêtre aux dimensions des composants
    }
   
}