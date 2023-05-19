package Model;


/**
 * La classe Unites fournit ...
 * 
 */
public abstract class Unites {
    protected int pointAttaque;
    protected int pointDefense;
    protected int pointDeplacementMax;
    protected int pointDeplacementRestant;
    protected int vision;
    protected int pointVieInitial;
    protected int pointVieFinal;

    /**
     * 
     * 
     */
    public Unites() {
    }
    
    public Unites(int pointAttaque, int pointDefense, int pointDeplacementMax, int pointDeplacementRestant, int vision,
            int pointVieInitial, int pointVieFinal) {
        this.pointAttaque = pointAttaque;
        this.pointDefense = pointDefense;
        this.pointDeplacementMax = pointDeplacementMax;
        this.pointDeplacementRestant = pointDeplacementRestant;
        this.vision = vision;
        this.pointVieInitial = pointVieInitial;
        this.pointVieFinal = pointVieFinal;
    }

    //Getters & Setters
    public int getPointAttaque() {
        return pointAttaque;
    }
    public void setPointAttaque(int pointAttaque) {
        this.pointAttaque = pointAttaque;
    }
    public int getPointDefense() {
        return pointDefense;
    }
    public void setPointDefense(int pointDefense) {
        this.pointDefense = pointDefense;
    }
    public int getPointDeplacementMax() {
        return pointDeplacementMax;
    }
    public void setPointDeplacementMax(int pointDeplacementMax) {
        this.pointDeplacementMax = pointDeplacementMax;
    }
    public int getPointDeplacementRestant() {
        return pointDeplacementRestant;
    }
    public void setPointDeplacementRestant(int pointDeplacementRestant) {
        this.pointDeplacementRestant = pointDeplacementRestant;
    }
    public int getVision() {
        return vision;
    }
    public void setVision(int vision) {
        this.vision = vision;
    }
    public int getPointVieInitial() {
        return pointVieInitial;
    }
    public void setPointVieInitial(int pointVieInitial) {
        this.pointVieInitial = pointVieInitial;
    }
    public int getPointVieFinal() {
        return pointVieFinal;
    }
    public void setPointVieFinal(int pointVieFinal) {
        this.pointVieFinal = pointVieFinal;
    }
    //Les Méthodes


    

}

/**
 * 
 * 
 */
class Infanterie extends Unites{
    private String typeUnite;

    /**
     * 
     * 
     */
    public Infanterie() {
        typeUnite = "Infanterie";
    }

    //Getters & Setters
    public String getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(String typeUnite) {
        this.typeUnite = typeUnite;
    }

}

/**
 * 
 * 
 */
class InfanterieLourde extends Unites{
    private String typeUnite;

     /**
      *
      * 
      */
     public InfanterieLourde() {
        typeUnite = "InfanterieLourde";
    }

    // Getters & Setters
    public String getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(String typeUnite) {
        this.typeUnite = typeUnite;
    }
}

/**
 * 
 * 
 */
class Mage extends Unites{
    private String typeUnite;

     /**
      * 
      *
      */
     public Mage() {
        typeUnite = "Mage";
    }

    // Getters & Setters
    public String getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(String typeUnite) {
        this.typeUnite = typeUnite;
    }
}

/**
 * 
 * 
 */
class Cavalerie extends Unites{
    private String typeUnite;

     /**
      * 
      *
      */
     public Cavalerie() {
        typeUnite = "Cavalerie";
    }

    // Getters & Setters
    public String getTypeUnite() {
        return typeUnite;
    }

    public void setTypeUnite(String typeUnite) {
        this.typeUnite = typeUnite;
    }
}
