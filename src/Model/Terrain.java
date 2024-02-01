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
    public Terrain() {
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
class Forêt extends Terrain {

        /**
         * Constructeur de la classe Forêt
         * 40% de bonus de défense
         * 2 pointDeplacement par case de forêt
         * les forêts sont occupables.
         */
        public Forêt() 
        {
        	super();
            this.bonusDef = 40;
            this.pointDeplacement =2;
            this.typeTerrain = 5;
            this.occupable = true;
        }

 }
    
class Village extends Terrain {

        /**
         * Constructeur de la classe Village
         * 40% de bonus de défense
         * 1 pointDeplacement par case de village
         * les villages sont occupables.
         */
        public Village() 
        {
        	super();
            this.bonusDef = 40;
            this.pointDeplacement =1;
            this.typeTerrain = 1;
            this.occupable = true;
        }

    }
class Forteresse extends Terrain {

        /**
         * Constructeur de la classe Forteresse
         * 60% de bonus de défense
         * 1 pointDeplacement par case de forteresse
         * les forteresses sont occupable.
         */
        public Forteresse()
        {
        	super();
            this.bonusDef = 60;
            this.pointDeplacement =1;
            this.typeTerrain = 2;
            this.occupable = true;
        }

    }

class EauProfonde extends Terrain {

        /**
         * Constructeur de la classe Eau Prodonde
         * 0% de bonus de défense
         * 5000 pointDeplacement par case de forêt
         * les cases d'eau profondes ne peuvent pas être occupées
         */
        public EauProfonde() 
        {
        	super();
            this.bonusDef = 0;
            this.pointDeplacement =5000;
            this.typeTerrain = 3;
            this.occupable = false;
        }

    }
class Plaine extends Terrain {

        /**
         * Constructeur de la classe Plaine
         * 20% de bonus de défense
         * 1 pointDeplacement par case de forêt
         * les plaines sont occupable.
         */
        public Plaine() 
        {
        	super();
            this.bonusDef = 20;
            this.pointDeplacement =1;
            this.typeTerrain = 4;
            this.occupable = true;
        }

    }
class Colline extends Terrain {

        /**
         * Constructeur de la classe Colline
         * 50% de bonus de défense
         * 2 pointDeplacement par case de forêt
         * les collines sont occupable.
         */
        public Colline()
        {
        	super();
            this.bonusDef = 50;
            this.pointDeplacement =2;
            this.typeTerrain = 6;
            this.occupable = true;
        }

    }
class Montagne extends Terrain {

        /**
         * Constructeur de la classe Montagne
         * 60% de bonus de défense
         * 3 pointDeplacement par case de forêt
         * les montagnes sont occupable.
         */
        public Montagne()
        {
        	super();
            this.bonusDef = 60;
            this.pointDeplacement =3;
            this.typeTerrain = 7;
            this.occupable = true;
        }


}







