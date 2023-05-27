package Model;

import java.util.ArrayList;

/**
 * Cette classe initialise un joueur. 
 */

public class Joueur{
    private String pseudo;
    private int numero;//Notre identiant de joueur 
    private int couleur;
    private ArrayList<Unites> unites = new ArrayList<Unites>();
    
    /**
     * 
     * 
     */
    public Joueur() {
    }

    public Joueur(String pseudo, int numero, int couleur) {
        this.pseudo = pseudo;
        this.numero = numero;
        this.couleur = couleur;
    }

    //Getters & Setters
    public String getNom() {
        return pseudo;
    }
    public void setNom(String pseudo) {
        this.pseudo = pseudo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCouleur() {
        return couleur;
    }
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    public ArrayList<Unites> getUnites(){
        return unites;
    }
    public void setUnites(ArrayList<Unites> unites){
        this.unites = unites;
    }

    //Methodes

    public void ajouterUnites(Unites unite){
        ArrayList<Unites> lu = this.getUnites();
        lu.add(unite);
        this.setUnites(lu);
    }

    public void passerTour(){ //est appelée lorsque le plateau fait JoueurSuivant()
        //cet fonction sert a préparer les unités du joueur à jouer au tourd d'après
        for (Unites u : this.getUnites()){
            if (u.getAction() == true && u.getPointVieMax() != u.getPointVieActuel()){
                int pvmax = u.getPointVieMax();
                int soin = (int) u.getPointVieActuel()+(pvmax/10);
                u.setPointVieActuel(Math.min(pvmax,soin)); //il ne faut pas dépasser la vie maximale
            }
            u.setAction(true);
            u.setPointDeplacementRestant(u.getPointDeplacementMax());
        }
    }
}