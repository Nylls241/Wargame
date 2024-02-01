package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe représentant le menu principal du jeu.
 */
public class MainMenu extends JFrame {

    private JPanel buttonPanel;
    private ImageIcon texture;
    private String pseudo1; // Pseudo du joueur 1
    private String pseudo2; // Pseudo du joueur 2

    /**
     * Constructeur du menu principal.
     */
    public MainMenu() {
        setTitle("Wargame");

        // Chargement de la texture
        texture = new ImageIcon("../textures/debut.jpg");

        // Calcul de la taille de la fenêtre
        setSize(1280, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du panel pour la texture
        JPanel texturePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Dessin de la texture
                Image image = texture.getImage();
                g.drawImage(image, 0, 0, 1280, 720, this);
            }
        };
        texturePanel.setPreferredSize(new Dimension(1280, 720));

        // Création des boutons
        JButton nouvellePartieButton = new JButton("Nouvelle partie");
        JButton chargerSauvegardeButton = new JButton("Charger sauvegarde");
        JButton quitterButton = new JButton("Quitter");

        // Ajout des écouteurs d'événements pour les boutons
        nouvellePartieButton.addActionListener(new NouvellePartieListener());
        quitterButton.addActionListener(new QuitterListener());

        // Création du panel pour les boutons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));

        // Ajout des boutons au panel des boutons
        buttonPanel.add(nouvellePartieButton);
        buttonPanel.add(chargerSauvegardeButton);
        buttonPanel.add(quitterButton);

        // Configuration du layout de la fenêtre principale
        setLayout(new BorderLayout());
        getContentPane().add(texturePanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.EAST);
    }

    /**
     * Méthode getter pour pseudo1.
     */
    public String getPseudo1() {
        return pseudo1;
    }

    /**
     * Méthode getter pour pseudo2.
     */
    public String getPseudo2() {
        return pseudo2;
    }

    /**
     * Classe interne représentant l'écouteur d'événements pour le bouton "Nouvelle partie".
     */
    private class NouvellePartieListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Supprimer le menu principal
            dispose();

            // Afficher le sous-menu pour demander les pseudos des joueurs
            SousMenuPseudos sousMenuPseudos = new SousMenuPseudos(texture);
            sousMenuPseudos.setVisible(true);
        }
    }

    /**
     * Classe interne représentant l'écouteur d'événements pour le bouton "Quitter".
     */
    private class QuitterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Quitter le programme
            System.exit(0);
        }
    }

    /**
     * Classe représentant le sous-menu pour demander les pseudos des joueurs.
     */
    private class SousMenuPseudos extends JFrame {

        private JTextField pseudoJoueur1Field;
        private JTextField pseudoJoueur2Field;

        /**
         * Constructeur du sous-menu des pseudos.
         */
        public SousMenuPseudos(ImageIcon texture) {
            setTitle("Wargame");
            // Calcul de la taille de la fenêtre
            int width = 1280;
            int height = 720;
            setSize(width, height);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Création du panel pour la texture
            JPanel texturePanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    // Dessin de la texture
                    Image image = texture.getImage();
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            };
            texturePanel.setPreferredSize(new Dimension(1280, 720));

            // Configuration du layout
            setLayout(new GridLayout(3, 1));

            // Ajout des éléments du sous-menu
            JLabel labelJoueur1 = new JLabel("Pseudo Joueur 1:");
            pseudoJoueur1Field = new JTextField();
            JButton confirmerJoueur1Button = new JButton("Confirmer");

            JLabel labelJoueur2 = new JLabel("Pseudo Joueur 2:");
            pseudoJoueur2Field = new JTextField();
            JButton confirmerJoueur2Button = new JButton("Confirmer");

            // Ajout des écouteurs d'événements pour les boutons
            confirmerJoueur1Button.addActionListener(new ConfirmerJoueur1Listener());
            confirmerJoueur2Button.addActionListener(new ConfirmerJoueur2Listener());

            // Ajout des éléments au sous-menu
            add(labelJoueur1);
            add(pseudoJoueur1Field);
            add(confirmerJoueur1Button);
            add(labelJoueur2);
            add(pseudoJoueur2Field);
            add(confirmerJoueur2Button);

            // Configuration du layout de la fenêtre du sous-menu
            getContentPane().add(texturePanel, BorderLayout.CENTER);
        }

        /**
         * Classe interne représentant l'écouteur d'événements pour le bouton "Confirmer" du joueur 1.
         */
        private class ConfirmerJoueur1Listener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                pseudo1 = pseudoJoueur1Field.getText(); // Récupérer le pseudo du joueur 1

                // Demande de confirmation
                int confirmation = JOptionPane.showConfirmDialog(null, "Confirmer le pseudo du Joueur 1 : " + pseudo1);

                if (confirmation == JOptionPane.YES_OPTION) {
                    // Enregistrement du pseudo du joueur 1
                    JOptionPane.showMessageDialog(null, "Pseudo du Joueur 1 enregistré : " + pseudo1);
                    pseudoJoueur1Field.setEditable(false); // Empêche la modification du pseudo

                    // Activation de la saisie pour le joueur 2
                    pseudoJoueur2Field.setEditable(true);
                }
            }
        }

        /**
         * Classe interne représentant l'écouteur d'événements pour le bouton "Confirmer" du joueur 2.
         */
        private class ConfirmerJoueur2Listener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                pseudo2 = pseudoJoueur2Field.getText(); // Récupérer le pseudo du joueur 2

                // Demande de confirmation
                int confirmation = JOptionPane.showConfirmDialog(null, "Confirmer le pseudo du Joueur 2 : " + pseudo2);

                if (confirmation == JOptionPane.YES_OPTION) {
                    // Enregistrement du pseudo du joueur 2
                    JOptionPane.showMessageDialog(null, "Pseudo du Joueur 2 enregistré : " + pseudo2);

                    // Affichage des pseudos sur le terminal
                    System.out.println("Pseudo Joueur 1 : " + pseudo1);
                    System.out.println("Pseudo Joueur 2 : " + pseudo2);

                    // Fermeture de la fenêtre
                    dispose();
                    // Lancer l'interface du plateau de jeu
                    InterfacePlateau interfacePlateau = new InterfacePlateau();
                    interfacePlateau.setVisible(true);
                }
            }
        }
    }
}


