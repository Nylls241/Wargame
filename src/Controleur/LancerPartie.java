package Controleur;

import Model.*;
import Vue.*;
import java.util.Random;

/**
 * Classe représentant le contrôleur pour lancer le jeu.
 */
public class LancerPartie {
    private Plateau plateau;
    private MainMenu mainMenu;;
    private Joueur joueur1;
    private Joueur joueur2;
    private Random numero;// Identifaint d'un joueur 
    private Random couleur;// Identifiant(unique) des unités d'un joueur 

    /**
     * Constructeur de la classe LancerPartie.
     */
    public LancerPartie() {
        // Création du modèle du plateau
        plateau = new Plateau();

        // Création de l'interface graphique du plateau
        mainMenu  = new MainMenu();

        // 
        joueur1 = new Joueur(mainMenu.getPseudo1(), numero.nextInt(3) + 1, couleur.nextInt(3) + 4);
        joueur2 = new Joueur(mainMenu.getPseudo2(), numero.nextInt(3) + 4, couleur.nextInt(3) +1);

        // Initialisation du plateau de jeu



        // Mise à jour de la vue avec le plateau initial
        mainMenu.setVisible(true);


        // Affichage de l'interface graphique
    }

    /**
     * Méthode principale pour lancer le jeu.
     * @param args les arguments de ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        LancerPartie jeu = new LancerPartie();
        
    }
}

