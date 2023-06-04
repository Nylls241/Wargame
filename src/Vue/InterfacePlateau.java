package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private int selectedHexagonX = -1; // Valeur par défaut pour indiquer qu'aucun hexagone n'est sélectionné
    private int selectedHexagonY = -1;

    private Image infanterieImage;
    private Image infanterieLourdeImage;
    private Image cavalerieImage;
    private Image mageImage;
    private Image archerImage;

    private String[][] unitMap;

    private JPanel buttonPanel;
    private JButton selectUnitButton;

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

        // Charger les images des unités
        infanterieImage = new ImageIcon(getClass().getResource("Infanterie2.png")).getImage();
        infanterieLourdeImage = new ImageIcon(getClass().getResource("InfanterieLourde2.png")).getImage();
        cavalerieImage = new ImageIcon(getClass().getResource("Cavalerie2.png")).getImage();
        mageImage = new ImageIcon(getClass().getResource("Mage2.png")).getImage();
        archerImage = new ImageIcon(getClass().getResource("Archer2.png")).getImage();

        // Initialiser la carte des unités
        unitMap = new String[ROWS][COLUMNS];
        initializeUnitMap();

        // Création d'un panneau pour contenir l'image et la grille d'hexagones
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Dessiner l'image de fond
                g2d.drawImage(background, 0, 0, null);

                // Dessiner les hexagones et les unités
                drawHexagons(g2d);
            }
        };
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT)); // Ajustez la taille selon vos besoins

        // Création du conteneur du bouton de sélection d'unité
        buttonPanel = new JPanel();
        selectUnitButton = new JButton("Sélectionner une unité");
        buttonPanel.add(selectUnitButton);

        // Création d'un composant JScrollPane pour permettre le défilement
        JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setColumnHeaderView(buttonPanel);

        setContentPane(scrollPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Gestionnaire d'événements pour le bouton de sélection d'unité
        selectUnitButton.addActionListener(e -> {
            if (selectedHexagonX != -1 && selectedHexagonY != -1) {
                // Lancement de la boîte de dialogue pour la sélection d'unité
                String[] units = {"Infanterie", "InfanterieLourde", "Cavalerie", "Mage", "Archer"};
                String selectedUnit = (String) JOptionPane.showInputDialog(
                        this,
                        "Sélectionnez une unité :",
                        "Sélection d'unité",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        units,
                        units[0]);

                // Mise à jour de la carte des unités avec l'unité sélectionnée
                unitMap[selectedHexagonY][selectedHexagonX] = selectedUnit;

                // Rafraîchir l'affichage
                repaint();
            }
        });

        // Gestionnaire d'événements pour le clic sur les hexagones
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                // Parcourir tous les hexagones pour trouver celui qui correspond aux coordonnées de la souris
                for (int row = 0; row < ROWS; row++) {
                    for (int col = 0; col < COLUMNS; col++) {
                        int x = col * 3 * HEX_WIDTH / 4 - HEX_WIDTH / 2;
                        int y = row * HEX_HEIGHT;

                        if (col % 2 == 1) {
                            y += HEX_HEIGHT / 2;
                        }

                        if (isMouseInsideHexagon(mouseX, mouseY, x, y)) {
                            selectedHexagonX = col;
                            selectedHexagonY = row;

                            // Redessiner les hexagones
                            panel.repaint();
                            return; // Sortir de la boucle si un hexagone est sélectionné
                        }
                    }
                }

                // Aucun hexagone sélectionné si aucun n'a été trouvé
                selectedHexagonX = -1;
                selectedHexagonY = -1;

                // Redessiner les hexagones
                panel.repaint();
            }
        });
    }

    private void drawHexagons(Graphics2D g2d) {
        // ...
    
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                int x = col * 3 * HEX_WIDTH / 4 - HEX_WIDTH / 2;
                int y = row * HEX_HEIGHT;
    
                if (col % 2 == 1) {
                    y += HEX_HEIGHT / 2;
                }
    
                // Dessiner la surbrillance sur l'hexagone sélectionné
                if (selectedHexagonX == col && selectedHexagonY == row) {
                    drawSelectedHexagon(g2d);
                }
    
                // Dessiner l'hexagone
                //drawHexagon(g2d, x, y);
    
                // Dessiner l'unité sur l'hexagone
                String unit = unitMap[row][col];
                if (unit != null) {
                    Image unitImage = getImageForUnit(unit);
                    if (unitImage != null) {
                        int unitX = x + (HEX_WIDTH - unitImage.getWidth(null)) / 2;
                        int unitY = y + (HEX_HEIGHT - unitImage.getHeight(null)) / 2 - HEX_HEIGHT / 4;
                        g2d.drawImage(unitImage, unitX-10, unitY-10, null);
                    }
                }
            }
        }
    }

    private void drawSelectedHexagon(Graphics2D g2d) {
        if (selectedHexagonX != -1 && selectedHexagonY != -1) {
            int x = selectedHexagonX * 3 * HEX_WIDTH / 4 - HEX_WIDTH / 2;
            int y = selectedHexagonY * HEX_HEIGHT;

            if (selectedHexagonX % 2 == 1) {
                y += HEX_HEIGHT / 2;
            }

            int[] xPoints = getHexagonXPoints(x);
            int[] yPoints = getHexagonYPoints(y);

            g2d.setColor(Color.RED);
            g2d.drawPolygon(xPoints, yPoints, 6);
        }
    }

    private boolean isMouseInsideHexagon(int mouseX, int mouseY, int hexagonX, int hexagonY) {
        int[] xPoints = getHexagonXPoints(hexagonX);
        int[] yPoints = getHexagonYPoints(hexagonY);

        Polygon hexagon = new Polygon(xPoints, yPoints, 6);
        return hexagon.contains(mouseX, mouseY);
    }

    private int[] getHexagonXPoints(int x) {
        int[] xPoints = { x, x + HEX_SIZE, x + HEX_SIZE + HEX_SIZE / 2, x + HEX_SIZE, x, x - HEX_SIZE / 2 };
        return xPoints;
    }

    private int[] getHexagonYPoints(int y) {
        int[] yPoints = { y + HEX_HEIGHT / 2, y + HEX_HEIGHT / 2, y, y - HEX_HEIGHT / 2, y - HEX_HEIGHT / 2, y };
        return yPoints;
    }

    private Image getImageForUnit(String unit) {
        if (unit.equals("Infanterie")) {
            return infanterieImage;
        } else if (unit.equals("InfanterieLourde")) {
            return infanterieLourdeImage;
        } else if (unit.equals("Cavalerie")) {
            return cavalerieImage;
        } else if (unit.equals("Mage")) {
            return mageImage;
        } else if (unit.equals("Archer")) {
            return archerImage;
        }
        return null;
    }

    private void initializeUnitMap() {
        // Initialiser la carte des unités avec des valeurs par défaut
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                unitMap[row][col] = null;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(InterfacePlateau::new);
    }
}
