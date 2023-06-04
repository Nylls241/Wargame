package Vue;
import javax.swing.*;
import java.awt.*;

public class InterfacePlateau extends JFrame {

    private JLabel displayField;
    private ImageIcon image;
    private Image background;

    private static final int WIDTH = 1272;
    private static final int HEIGHT = 1101;
    private static final int HEX_SIZE = 21;
    private static final int HEX_HEIGHT = (int) (Math.sqrt(3) * HEX_SIZE);
    private static final int HEX_WIDTH = 2 * HEX_SIZE;
    private static final int ROWS = 31;
    private static final int COLUMNS = 41;

    /**
     * Constructeur de la classe InterfacePlateau.
     */
    public InterfacePlateau() {
        // Configuration de la fenêtre
        setTitle("Plateau de jeu : WarGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Charger l'image du plateau de jeu
        try {
            background = new ImageIcon(getClass().getResource("plateau2.png")).getImage();
        } catch (Exception e) {
            System.out.println("Image non trouvée");
        }

        // Création d'un panneau pour contenir l'image et la grille d'hexagones
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Dessiner l'image de fond
                g2d.drawImage(background, 0, 0, null);

                // Dessiner les hexagones
                drawHexagons(g2d);
            }
        };
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT)); // Ajustez la taille selon vos besoins

        // Création d'un composant JScrollPane pour permettre le défilement
        JScrollPane scrollPane = new JScrollPane(panel);
        setContentPane(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void drawHexagons(Graphics2D g2d) {
        
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                int x = col * 3 * HEX_WIDTH / 4 - HEX_WIDTH / 2 ;
                int y = row * HEX_HEIGHT ;

                /* 
                if (row % 3 == 0 && row !=0 && col % 2 == 0){
                    y += 1; 
                }

                if (col % 2 == 1 && row = 3){
                    y +=1;
                }

               // if (col % 2 == 1 &&

               */


                
                if (col % 2 == 1) {
                    y += HEX_HEIGHT / 2;
                }
                

                drawHexagon(g2d, x, y);
            }
        }
    }

    private void drawHexagon(Graphics2D g2d, int x, int y) {
        int[] xPoints = { x, x + HEX_SIZE, x + HEX_SIZE + HEX_SIZE / 2, x + HEX_SIZE, x, x - HEX_SIZE / 2 };
        int[] yPoints = { y + HEX_HEIGHT / 2, y + HEX_HEIGHT / 2, y, y - HEX_HEIGHT / 2, y - HEX_HEIGHT / 2, y };

        g2d.setColor(new Color(0, 0, 0)); // Couleur transparente pour l'hexagone
        g2d.drawPolygon(xPoints, yPoints, 6);

        g2d.setColor(new Color(255, 255, 255, 100)); // Couleur de remplissage transparente pour l'hexagone
        g2d.fillPolygon(xPoints, yPoints, 6);
    }


    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfacePlateau());
    }

    
}
