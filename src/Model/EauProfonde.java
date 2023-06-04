package Model;

public class EauProfonde extends Terrain {

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