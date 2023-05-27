package Model;

/**
 * Cette classe sert à contenir une unité d'un joueur avec un terrain donné 
 *Et à être visible ou non. 
 *En résumé, c'est une case de plateau.  
 */
public class Hexagone {
    private Terrain terrain;
    private Unites unite;
    private boolean visible;
    private int coordonneeX; //colonnes
    private int coordonneeY; //lignes

    /**
     * Constructeur de la classe Hexagone 
     * Initialise un terrain fixe, sans unité avec le fait que la case ne soit pas visible 
     * par l'adversaire dans un premier temps
     * broouillard de guerre
     */
    public Hexagone() {
    }
    
    public Hexagone(Unites unite, Terrain terrain, boolean visible, int coordonneeX, int coordonneeY) {
        this.unite = null;
        this.terrain = terrain;
        this.visible = false;
        this.coordonneeX = coordonneeX;
        this.coordonneeY = coordonneeY;
    }

    //Getters & Setters
    public Unites getUnite() {
        return unite;
    }
    public void setUnite(Unites unite) {
        this.unite = unite;
    }
    public Terrain getTerrain(){
        return  terrain;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getCoordonneeX() {
        return coordonneeX;
    }

    public int getCoordonneeY() {
        return coordonneeY;
    }

    public int distance(Hexagone cible){
        int dist = 0;
        int xCible = cible.getCoordonneeX(); //colonne
        int yCible = cible.getCoordonneeY(); //ligne
        while (xCible != this.getCoordonneeX() || yCible != this.getCoordonneeY()){
            if(xCible < this.getCoordonneeX() && yCible < this.getCoordonneeY()){
                xCible++;
                yCible++;
            }
            else if(xCible < this.getCoordonneeX() && yCible == this.getCoordonneeY()){
                xCible++;
            }
            else if (xCible == this.getCoordonneeX() && yCible > this.getCoordonneeY()){
                yCible--;
            }
            else if (xCible > this.getCoordonneeX() && yCible == this.getCoordonneeY()){
                xCible--;
            }
            else if(xCible > this.getCoordonneeX() && yCible < this.getCoordonneeY()){
                xCible--;
                yCible++;
            }
            else if(xCible == this.getCoordonneeX() && yCible < this.getCoordonneeY()){
                yCible++;
            }
            else if(xCible < this.getCoordonneeX() && yCible > this.getCoordonneeY()){
                xCible++;
                yCible--;
                dist++; //car par exemple x0y4 et x1y3 ne sont pas voisin
            }
            else if(xCible > this.getCoordonneeX() && yCible > this.getCoordonneeY()){
                xCible--;
                yCible--;
                dist++; //car par exemple x2y4 et x1y3 ne sont pas voisin
            }
            dist++;
            System.out.println(dist);
        }
        
        return dist;
    }
    
    
    
}
