package Model;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<ArrayList<Hexagone>> cases = new ArrayList<ArrayList<Hexagone>>(); 
    private int tourActuel;//Notre identiant de joueur 
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public Plateau(){

    }

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

    public Hexagone getCaseXY(int x, int y){
        return this.cases.get(x).get(y);
    }
}
