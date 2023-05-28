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
    private Plateau plateau;
    
    /**
     * 
     * 
     */
    public Joueur() {
    }

    /**
     * Constructeur de la classe joueur
     * @param pseudo string stockant le pseudonyme du joueur à afficher
     * @param numero indice unique du joueur, permet de diriger les tours d'action de la partie
     * @param couleur couleur à appliquer aux unités du joueur
     */
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
    public Plateau getPlateau(){
        return this.plateau;
    }
    public void setPlateau(Plateau plateau){
        this.plateau = plateau;
    }

    //Methodes

    /**
     * Méthode permettant d'ajouter une unité aux unités du joueur
     * @param unite Unité à ajouter au joueur
     */
    public void ajouterUnites(Unites unite){
        ArrayList<Unites> lu = this.getUnites();
        lu.add(unite);
        this.setUnites(lu);
    }

    /**
     * Méthode préparant les unités du joueur a leur prochain tour
     * Elle restore les points d'action et de déplacement de chaque unité
     * si l'unité n'as pas joué, lui rend 10% de sa vie max
     */
    public void passerTour(){ //est appelée lorsque le plateau fait JoueurSuivant()
        //cet fonction sert a préparer les unités du joueur à jouer au tourd d'après
        for (Unites u : this.getUnites()){
            if (u.getAction() == true && u.getPointDeplacementMax() == u.getPointDeplacementRestant() && u.getPointVieMax() != u.getPointVieActuel()){ //si unité n'a rien fait
                int pvmax = u.getPointVieMax(); //on soigne l'unité
                int soin = (int) u.getPointVieActuel()+(pvmax/10);
                u.setPointVieActuel(Math.min(pvmax,soin)); //il ne faut pas dépasser la vie maximale
            }
            u.setAction(true);
            u.setPointDeplacementRestant(u.getPointDeplacementMax());
        }
    }
}