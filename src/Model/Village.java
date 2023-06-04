package Model;

public class Village extends Terrain {
    public Village() {
        super();
        this.bonusDef = 40;
        this.pointDeplacement = 1;
        this.typeTerrain = 1;
        this.occupable = true;
    }
}