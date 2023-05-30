package Controleur;

import Model.*;
import Vue.*;
import java.util.Random;

/**
 * Classe représentant le contrôleur pour lancer le jeu.
 */
public class LancerPartie {
    private Plateau plateau;
    private MainMenu mainMenu;
    private Joueur joueur1;
    private Joueur joueur2;
    private Random numero; // Identifiant d'un joueur
    private Random couleur; // Identifiant(unique) des unités d'un joueur

    /**
     * Constructeur de la classe LancerPartie.
     */
    public LancerPartie() {
        // Création du modèle du plateau
        plateau = new Plateau();

        // Création de l'interface graphique du plateau
        mainMenu = new MainMenu();

        // Initialisation des générateurs aléatoires
        numero = new Random();
        couleur = new Random();

        // Affichage du menu principal
        mainMenu.setVisible(true);
    }

    /**
     * Méthode pour lancer le jeu.
     */
    public void lancerJeu() {
        // Vérification des pseudos des joueurs
        String pseudo1 = mainMenu.getPseudo1();
        String pseudo2 = mainMenu.getPseudo2();

        if (pseudo1 != null && !pseudo1.isEmpty() && pseudo2 != null && !pseudo2.isEmpty()) {
            // Création des joueurs avec des identifiants aléatoires
            joueur1 = new Joueur(pseudo1, numero.nextInt(3) + 1, couleur.nextInt(3) + 4);
            joueur2 = new Joueur(pseudo2, numero.nextInt(3) + 4, couleur.nextInt(3) + 1);

            // Initialisation du plateau de jeu

            // Mise à jour de la vue avec le plateau initial

            // Lancement de l'interface graphique du plateau

        } else {
            // Affichage d'un message d'erreur si les pseudos sont vides ou non saisis
            System.out.println("Veuillez saisir les pseudos des joueurs.");
        }
    }

    /**
     * Méthode principale pour lancer le jeu.
     * @param args les arguments de ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        LancerPartie jeu = new LancerPartie();
        jeu.lancerJeu();
    }
}

