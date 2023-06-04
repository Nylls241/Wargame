package Model;

public class Forteresse extends Terrain {

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