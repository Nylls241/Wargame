package Controleur;

import Model.Terrain;

public class TerrainController {

    public static void main(String[] args) {

        int i = 0, j = 0;
        // Création des terrains
        Terrain[][] map = new Terrain[10][10]; // Remplacez la taille de la carte selon vos besoins

        // Définition des terrains pour chaque hexagone de la carte
                // Utilisez les différentes classes de terrain pour chaque position de la carte
                map[i][j] = new Foret();
                    

        // Affichage des terrains de la carte
        Terrain terrain = map[i][j];
        System.out.println("Terrain [" + i + "][" + j + "]: " + terrain.getClass().getSimpleName());
        System.out.println("Bonus de défense : " + terrain.getBonusDef());
        System.out.println("Coût en points de déplacement : " + terrain.getPointDeplacement());
        System.out.println("Occupable : " + terrain.isOccupable());
        System.out.println();
    }
}
