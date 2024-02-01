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
        this.unite = null;
        this.terrain = new Village();
        this.visible = false;
    }
    
    /**
     * Constructeur de la classe Hexagone 
     * Initialise un terrain donné, avec ou sans unité, visible ou non, avec ses coordonnees
     * @param unite l'unité qui occupe l'Hexagone, null si la case est vide
     * @param terrain le terrain qui compose la case, a remplacer par une case fille
     * @param visible booléen, si true la case est actuellement visivle
     * @param coordonneeX l'indice de la colonne où est positionnée l'Hexagone
     * @param coordonneeY l'indice de la ligne où est positionnéé l'Hexagone
     */
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

    /**
     * Cermet d'obtenir la distance entre l'Hexagone actuel et un Hexagone donné
     * @param cible hexagone avec lequel on souhaite mesurer la distance
     * @return integer de distance avec cible 
     */
    public int distance(Hexagone cible){
        int dist = 0;
        int xCible = cible.getCoordonneeX(); //colonne
        int yCible = cible.getCoordonneeY(); //ligne
        if(this.getCoordonneeX()%2==0){ //si l'hexagone est sur une colonne paire (car selon la parité de la colonne les voisins diffèrent)
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
            }
        }
        else{ //si l'hexagone est sur une colonne impaire
            while (xCible != this.getCoordonneeX() || yCible != this.getCoordonneeY()){
                if(xCible < this.getCoordonneeX() && yCible < this.getCoordonneeY()){
                    xCible++;
                    yCible++;
                    dist++; //car par exemple x1y1 et x0y0 ne sont pas voisin
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
                    dist++; //car par exemple x1y1 et x2y0 ne sont pas voisin
                }
                else if(xCible == this.getCoordonneeX() && yCible < this.getCoordonneeY()){
                    yCible++;
                }
                else if(xCible < this.getCoordonneeX() && yCible > this.getCoordonneeY()){
                    xCible++;
                    yCible--;
                    
                }
                else if(xCible > this.getCoordonneeX() && yCible > this.getCoordonneeY()){
                    xCible--;
                    yCible--;
                    
                }
                dist++;
            }
        }
        return dist;
    }
    
    
    
}
