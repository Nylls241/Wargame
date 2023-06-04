package Controleur;

import Model.*;

import java.util.ArrayList;

public class TerrainController {

    public static void main(String[] args) {

        int tailleMaxColonne = 10; // Remplacez la taille de la carte selon vos besoins
        int tailleMaxLigne = 10; // Remplacez la taille de la carte selon vos besoins

        // Création des terrains
        Terrain[][] map = new Terrain[tailleMaxColonne][tailleMaxLigne];

        // Définition des terrains pour chaque hexagone de la carte

        // ligne 1 
        map[0][0] = new EauProfonde();
        map[1][0] = new EauProfonde();
        map[2][0] = new EauProfonde();
        map[3][0] = new EauProfonde();
        map[4][0] = new EauProfonde();
        map[5][0] = new Foret();
        map[6][0] = new Foret();
        map[7][0] = new Foret();
        map[8][0] = new Foret();
        map[9][0] = new Foret();
        map[10][0] = new Foret();
        map[11][0] = new Foret();
        map[12][0] = new EauProfonde();
        map[13][0] = new EauProfonde();
        map[14][0] = new EauProfonde();
        map[15][0] = new EauProfonde();
        map[16][0] = new EauProfonde();
        map[17][0] = new EauProfonde();
        map[18][0] = new EauProfonde();
        map[19][0] = new EauProfonde();
        map[20][0] = new EauProfonde();
        map[21][0] = new EauProfonde();
        map[22][0] = new EauProfonde();
        map[23][0] = new EauProfonde();
        map[24][0] = new EauProfonde();
        map[25][0] = new EauProfonde();
        map[26][0] = new EauProfonde();
        map[27][0] = new EauProfonde();
        map[28][0] = new Plaine();
        map[29][0] = new Village();
        map[30][0] = new Plaine();
        map[31][0] = new Montagne();
        map[32][0] = new Montagne();
        map[33][0] = new Foret();
        map[34][0] = new Foret();
        map[35][0] = new Foret();
        map[36][0] = new Foret();
        map[37][0] = new Foret();
        map[38][0] = new Plaine();
        map[39][0] = new Plaine();

        // ligne 2

        map[0][1] = new EauProfonde();
        map[1][1] = new EauProfonde();
        map[2][1] = new EauProfonde();
        map[3][1] = new EauProfonde();
        map[4][1] = new EauProfonde();
        map[5][1] = new Foret();
        map[6][1] = new Foret();
        map[7][1] = new Plaine();
        map[8][1] = new Foret();
        map[9][1] = new Foret();
        map[10][1] = new Foret();
        map[11][1] = new Foret();
        map[12][1] = new Foret();
        map[13][1] = new Plaine();
        map[14][1] = new EauProfonde();
        map[15][1] = new EauProfonde();
        map[16][1] = new EauProfonde();
        map[17][1] = new EauProfonde();
        map[18][1] = new EauProfonde();
        map[19][1] = new EauProfonde();
        map[20][1] = new EauProfonde();
        map[21][1] = new EauProfonde();
        map[22][1] = new EauProfonde();
        map[23][1] = new EauProfonde();
        map[24][1] = new EauProfonde();
        map[25][1] = new Foret();
        map[26][1] = new EauProfonde();
        map[27][1] = new Plaine();
        map[28][1] = new ();
        map[29][1] = new ();
        map[30][1] = new ();
        map[31][1] = new ();
        map[32][1] = new ();
        map[33][1] = new ();
        map[34][1] = new ();
        map[35][1] = new ();
        map[36][1] = new ();
        map[37][1] = new ();
        map[38][1] = new ();
        map[39][1] = new ();

        

        

        /* 
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                // Utilisez les différentes classes de terrain pour chaque position de la carte
                if (x % 2 == 0) {
                    if (y % 2 == 0) {
                        map[x][y] = new Foret();
                    } else {
                        map[x][y] = new Plaine();
                    }
                } else {
                    if (y % 2 == 0) {
                        map[x][y] = new Montagne();
                    } else {
                        map[x][y] = new EauProfonde();
                    }
                }
            }
        }

        */

        // Créer la liste d'hexagones
        ArrayList<ArrayList<Hexagone>> cases = new ArrayList<>();

        // Ajouter des colonnes à la liste d'hexagones
        for (int x = 0; x < tailleMaxColonne; x++) {
            cases.add(new ArrayList<>());
        }

        // Ajouter les hexagones dans les colonnes
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                // Créer un nouvel hexagone avec les informations données
                Hexagone hexagone = new Hexagone(null, map[x][y], true, x, y);
                // Remplacer "null" par une instance de la classe Unites si nécessaire
                // Remplacer "true" par la visibilité de l'hexagone si nécessaire

                // Ajouter l'hexagone à la colonne correspondante
                cases.get(x).add(hexagone);
            }
        }
        int y = 0;
        for (int x = 0; x < 7; x++) {
            Hexagone hexagone = cases.get(x).get(y);
            System.out.println("Hexagone [" + x + "][" + y + "]: " + hexagone.getTerrain().getClass().getSimpleName());
            System.out.println("Bonus de défense : " + hexagone.getTerrain().getBonusDef());
            System.out.println("Coût en points de déplacement : " + hexagone.getTerrain().getPointDeplacement());
            System.out.println("Occupable : " + hexagone.getTerrain().isOccupable());
            System.out.println();
        }


        /* 
        // Affichage des terrains de la carte
        for (int x = 0; x < tailleMaxColonne; x++) {
            for (int y = 0; y < tailleMaxLigne; y++) {
                Hexagone hexagone = cases.get(x).get(y);
                System.out.println("Hexagone [" + x + "][" + y + "]: " + hexagone.getTerrain().getClass().getSimpleName());
                System.out.println("Bonus de défense : " + hexagone.getTerrain().getBonusDef());
                System.out.println("Coût en points de déplacement : " + hexagone.getTerrain().getPointDeplacement());
                System.out.println("Occupable : " + hexagone.getTerrain().isOccupable());
                System.out.println();
            }
        }

        */
    }
}
