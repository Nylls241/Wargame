package Model;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<ArrayList<Hexagone>> cases = new ArrayList<ArrayList<Hexagone>>(); 
    private int tourActuel;//Notre identiant de joueur 
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public Plateau(){

    }

    /**
     * Constructeur de plateau, avec le tableau des cases et la liste de joueurs
     * @param cases la liste des colonnes d'Hexagones du tableau
     * @param joueurs la liste des joueurs
     */
    public Plateau(ArrayList<ArrayList<Hexagone>> cases, ArrayList<Joueur> joueurs){
        this.cases = cases;
        this.joueurs = joueurs;
        tourActuel = 0; //id du 1er joueur
        for(Joueur j : this.joueurs){
            j.setPlateau(this);
        }
    }

    public ArrayList<Joueur>getJoueurs(){
        return this.joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs){
        this.joueurs = joueurs;
    }

    public int getTourActuel(){
        return this.tourActuel;
    }

    public void setTourActuel(int tourActuel){
        this.tourActuel = tourActuel;
    }

    public ArrayList<ArrayList<Hexagone>> getCases(){
        return this.cases;
    }

    public void setCases(ArrayList<ArrayList<Hexagone>> cases){
        this.cases = cases;
    }

    /**
     * Permet d'obtenir une case donnée
     * @param x la colonne de la case voulue
     * @param y la ligne de la case voulue
     * @return l'hexagone[x][y]
     */
    public Hexagone getCaseXY(int x, int y){
        return this.cases.get(x).get(y);
    }

    //Méthodes

    /**
     * change le tour actuel
     * rend invisible toutes les cases
     * rend visible les cases à portée de visions des unités du nouveau joueur dont c'est le tour
     */
    public void JoueurSuivant(){
        if (this.getTourActuel() == 0){
            this.setTourActuel(1);
        }
        else{
            this.setTourActuel(0);
        }
        for (ArrayList<Hexagone> colonne : getCases()){ //contrôle la visibilité des cases
            for (Hexagone ligne : colonne){
                ligne.setVisible(false);
                for (Unites u : this.getJoueurs().get(this.getTourActuel()).getUnites()){
                    if (ligne.distance(u.getEmplacement()) <= u.getVision()){
                        ligne.setVisible(true);
                    }
                }
                
            }
        }
    }

}
