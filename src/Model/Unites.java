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
    protected int pointVieMax;
    protected int pointVieActuel;
    protected boolean action; //permet de savoir si l'unité à déjà joué à ce tour
    protected Joueur proprietaire;
    protected int typeUnite;
    protected int portee; //portée des attaques de l'unité
    protected Hexagone emplacement; //localisation de l'unité.


    /**
     * 
     * 
     */
    public Unites() {
    }
    
    public Unites(int pointAttaque, int pointDefense, int pointDeplacementMax, int vision,
            int pointVieMax, Joueur proprietaire, int typeUnite, int portee, Hexagone emplacement) {
        this.pointAttaque = pointAttaque;
        this.pointDefense = pointDefense;
        this.pointDeplacementMax = pointDeplacementMax;
        this.pointDeplacementRestant = pointDeplacementMax; //lorsqu'une unité est créée, on considère qu'elle peut se déplacer normalement
        this.vision = vision;
        this.pointVieMax = pointVieMax;
        this.pointVieActuel = pointVieMax; //lorsqu'une unité est créée, on considère qu'elle n'est pas blessée
        this.action = true; //lorsqu'une unité est créée, on considère qu'elle peut jouer au tour actuel
        this.proprietaire = proprietaire;
        this.typeUnite = typeUnite;
        this.portee = portee;
        this.emplacement = emplacement;
        this.emplacement.setUnite(this);
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
    public int getPointVieMax() {
        return pointVieMax;
    }
    public int getPointVieActuel() {
        return pointVieActuel;
    }
    public void setPointVieActuel(int pointVieActuel) {
        this.pointVieActuel = pointVieActuel;
    }
    public boolean getAction(){
        return action;
    }
    public void setAction(boolean action){
        this.action = action;
    }
    public Joueur getProprietaire(){
        return proprietaire;
    }
    public int getTypeUnite(){
        return typeUnite;
    }
    public int getPortee(){
        return portee;
    }
    public Hexagone getEmplacement(){
        return emplacement;
    }
    public void setEmplacement(Hexagone newEmplacement){ //ça marche
        this.emplacement.setUnite(null);//retire l'unité de l'ancien emplacement
        this.emplacement = newEmplacement; //changer l'emplacement de l'unité
        this.emplacement.setUnite(this); //appliquer le changement
    }
    //Les Méthodes

    public void attaquer(Unites cible){//on considère que x0;y0 est en haut à gauche de la carte.
        int xCible = cible.getEmplacement().getCoordonneeX();
        int yCible = cible.getEmplacement().getCoordonneeY();
        int xOrigine = this.getEmplacement().getCoordonneeX();
        int yOrigine = this.getEmplacement().getCoordonneeY();
        int difx = Math.abs(xCible-xOrigine);
        int dify = Math.abs(yCible-yOrigine);
        
    }
}

/**
 * 
 * 
 */
class Infanterie extends Unites{

    /**
     * 
     * 
     */
    public Infanterie(Joueur proprietaire,  Hexagone emplacement) {
        super(5, 3, 6, 4, 28, proprietaire, 1, 1, emplacement);
    }

}

/**
 * 
 * 
 */
class InfanterieLourde extends Unites{


     /**
      *
      * 
      */
     public InfanterieLourde(Joueur proprietaire,  Hexagone emplacement) {
        super(10, 10, 4, 4, 38, proprietaire, 2, 1, emplacement);
    }


}

/**
 * 
 * 
 */
class Mage extends Unites{


     /**
      * 
      *
      */
     public Mage(Joueur proprietaire,  Hexagone emplacement) {
        super(10, 1, 5, 5, 24, proprietaire, 3, 2, emplacement);
    }


}

/**
 * 
 * 
 */
class Cavalerie extends Unites{


     /**
      * 
      *
      */
    public Cavalerie(Joueur proprietaire,  Hexagone emplacement) {
        super(8, 3, 8, 6, 38, proprietaire, 4, 1, emplacement);
    }


}

/**
 * 
 * 
 */
class Archer extends Unites{

    /**
      * 
      *
      */
    public Archer(Joueur proprietaire,  Hexagone emplacement) {
        super(6, 2, 5, 7, 33, proprietaire, 5, 3, emplacement);
    }
}
