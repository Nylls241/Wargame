package Model;

public class Montagne extends Terrain {

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