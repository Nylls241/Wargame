package Model;

/**
 * Cette classe sert à contenir une unité d'un joueur avec un terrain donné 
 *Et à être visible ou non. 
 *En résumé, c'est une case de plateau.  
 */
public class Hexagone {
    Terrain terrain;
    Unites unite;
    boolean visible;

    /**
     * Constructeur de la classe Hexagone 
     * Initialise un terrain fixe, sans unité avec le fait que la case ne soit pas visible 
     * par l'adversaire dans un premier temps
     * broouillard de guerre
     */
    public Hexagone() {
    }
    
    public Hexagone(Unites unite, Terrain terrain, boolean visible) {
        this.unite = null;
        this.terrain = terrain;
        this.visible = false;
    }

    //Getters & Setters
    public Unites getUnite() {
        return unite;
    }
    public void setUnite(Unites unite) {
        this.unite = unite;
    }
    public Terrain getTerrai(){
        return  terrain;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}
