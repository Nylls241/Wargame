package Model;

public class Colline extends Terrain {

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