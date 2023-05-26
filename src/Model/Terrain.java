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
 * On a les différents attributs nécessaires à sa création et à sa caractérisation 
 * On code les Getters et ensuite nos classes filles auxquelles on attribue les données de l'énoncé concernant les caractéristiques 
 * en sachant que typeTerrain est attribué de telle sorte à ce que cela serve d'id pour les différentes classes filles, et que le booléen
 * occupable nous sert pour différencier eau profonde des autres terrains.
 */
    public Terrain(int pointDeplacement, int bonusDef, int typeTerrain,boolean occupable) 
    {

    }

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
    
class Forêt extends Terrain {

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

        public Montagne()
        {
        	super();
            this.bonusDef = 60;
            this.pointDeplacement =3;
            this.typeTerrain = 7;
            this.occupable = true;
        }


}
}





