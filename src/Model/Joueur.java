package Model;
/**
 * Cette classe initialise un joueur. 
 */

public class Joueur{
    private String pseudo;
    private int numero;//Notre identiant de joueur 
    private int couleur;
    private int nombreUnite;
    
    /**
     * 
     * 
     */
    public Joueur() {
    }

    public Joueur(String pseudo, int numero, int couleur, int nombreUnite) {
        this.pseudo = pseudo;
        this.numero = numero;
        this.couleur = couleur;
        this.nombreUnite = nombreUnite;
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
    public int getNombreUnite() {
        return nombreUnite;
    }
    public void setNombreUnite(int nombreUnite) {
        this.nombreUnite = nombreUnite;
    }

    //Methodes

    public void ajouterUnites(){

    }

    public void calculerScores(){

    }
}