package Model;

/**
 * Cette classe sert à définir les différents terrains de jeu ,de part
 * les différents effets qui leurs sont appliqués ,soit le bonus de défense et le coût 
 * en point de déplacement .
 *On a donc une classe terrain avec différentes classes filles que sont les différents types de terrain
 *de l'énoncé.
 * 
 *
 */


public abstract class Terrain {
    protected int pointDeplacement;
    protected int bonusDef;
    protected int typeTerrain;
    protected boolean occupable;

/**
 * Constructeur de la classe Terrain 
 * Inutilisé car c'est une classe abstraite
 */
    protected Terrain() {
	}

	// Getters
    public int getPointDeplacement() {
        return pointDeplacement;
    }

    public int getBonusDef() {
        return bonusDef;
    }

    public int getTypeTerrain() {
        return typeTerrain;
    }

    public boolean isOccupable() {
        return occupable;
    }
}












