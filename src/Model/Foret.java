package Model;

public class Foret extends Terrain {

    /**
     * Constructeur de la classe Forêt
     * 40% de bonus de défense
     * 2 pointDeplacement par case de forêt
     * les forêts sont occupables.
     */
    public Foret() 
    {
        super();
        this.bonusDef = 40;
        this.pointDeplacement =2;
        this.typeTerrain = 5;
        this.occupable = true;
    }

}
