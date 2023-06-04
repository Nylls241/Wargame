package Model;

public class Plaine extends Terrain {

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
