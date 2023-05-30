package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Interface graphique du plateau de jeu.
 */
public class InterfacePlateau extends JFrame {
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    private static final int HEX_SIZE = 21;
    private static final int HEX_HEIGHT = (int) (Math.sqrt(3) * HEX_SIZE);
    private static final int HEX_WIDTH = 2 * HEX_SIZE;
    private static final int ROWS = 30; // Nombre de rangées d'hexagones
    private static final int COLUMNS = 40; // Nombre de colonnes d'hexagones

    private Image background;

    /**
     * Constructeur de l'interface du plateau de jeu.
     */
    public InterfacePlateau() {
        setTitle("Plateau de jeu");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        background = new ImageIcon("../textures/plateau1.png").getImage(); // Charger l'image du plateau de jeu

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, null); // Dessiner l'image du plateau de jeu

                drawHexagons(g);
            }
        };

        JScrollPane scrollPane = new JScrollPane(panel); // Envelopper le panneau avec le JScrollPane
        setContentPane(scrollPane); // Utiliser le JScrollPane comme contenu de la JFrame

        // Ajuster la taille préférée du panneau pour permettre le défilement
        panel.setPreferredSize(new Dimension(COLUMNS * HEX_WIDTH, ROWS * HEX_HEIGHT + HEX_HEIGHT / 2));
        panel.revalidate();
    }

    /**
     * Dessine les hexagones sur le plateau de jeu.
     *
     * @param g l'objet Graphics pour dessiner
     */
    private void drawHexagons(Graphics g) {
        int startX = 0;
        int startY = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                int x = startX + col * 3 * HEX_WIDTH / 4;
                int y = startY + row * HEX_HEIGHT;

                if (col % 2 == 1) {
                    y += HEX_HEIGHT / 2;
                    x -= HEX_WIDTH / 2;
                } else {
                    x -= HEX_WIDTH / 2;
                }

                drawHexagon(g, x, y);
            }
        }
    }

    /**
     * Dessine un hexagone à une position donnée.
     *
     * @param g l'objet Graphics pour dessiner
     * @param x la coordonnée x de l'hexagone
     * @param y la coordonnée y de l'hexagone
     */
    private void drawHexagon(Graphics g, int x, int y) {
        int[] xPoints = {x, x + HEX_SIZE, x + HEX_SIZE + HEX_SIZE / 2, x + HEX_SIZE, x, x - HEX_SIZE / 2};
        int[] yPoints = {y + HEX_HEIGHT / 2, y + HEX_HEIGHT / 2, y, y - HEX_HEIGHT / 2, y - HEX_HEIGHT / 2, y};

        g.setColor(new Color(0, 0, 0)); // Couleur transparente pour l'hexagone
        g.drawPolygon(xPoints, yPoints, 6);

        g.setColor(new Color(255, 0, 0, 0)); // Couleur de remplissage transparente pour l'hexagone
        g.fillPolygon(xPoints, yPoints, 6);
    }

    /**
     * Méthode principale pour exécuter l'interface du plateau de jeu.
     *
     * @param args les arguments de ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        InterfacePlateau interfacePlateau = new InterfacePlateau();
        interfacePlateau.setVisible(true);
    }
}
