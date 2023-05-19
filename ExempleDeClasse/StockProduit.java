package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


/**
 * Produit : Permet d’ajouter des nouveaux produits et les gérer par la suite.
 * @author  Nylls Gersan BOUTOTO
 * @version 1.0
 * 
 **/
public class StockProduit {
    protected int idProduit;
    protected String nom;
    protected String description;
    protected String typeProduit;
    protected double prix;
    protected String paysOrigine;
    protected double pourcentageTVA;
    protected int quantiteStock;
    protected String nomFournisseur;

    //Constructeur(s)
    
    public StockProduit(int idProduit, String nom, String description, String typeProduit, double prix,
            String paysOrigine, double pourcentageTVA, int quantiteStock, String nomFournisseur) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.description = description;
        this.typeProduit = typeProduit;
        this.prix = prix;
        this.paysOrigine = paysOrigine;
        this.pourcentageTVA = pourcentageTVA;
        this.quantiteStock = quantiteStock;
        this.nomFournisseur = nomFournisseur;
    
    }

    public StockProduit() {
        this.pourcentageTVA = 7;
        this.quantiteStock = 0;
        
    }

    //Getters et Setters
    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(String typeProduit) {
        this.typeProduit = typeProduit;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPaysOrigine() {
        return paysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        this.paysOrigine = paysOrigine;
    }

    public double getPourcentageTVA() {
        return pourcentageTVA;
    }

    public void setPourcentageTVA(double pourcentageTVA) {
        this.pourcentageTVA = pourcentageTVA;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    //Methodes

    /**
     * Ajoute un produit dans la base de donnée du point de vente.
     * @param nom
     * @param description
     * @param typeProduit
     * @param prix
     * @param paysOrigine
     * @param nomFournisseur
     */

    public void ajouterProduit(
     String nom,
     String description,
     String typeProduit,
     double prix,
     String paysOrigine,
     String nomFournisseur
) {
    // Établir la connexion à la base de données
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LeadelMarche", "root", "")) {

        // Vérifier si le produit existe déjà dans la base de données
        String selectQuery = "SELECT numero_produit, quantite_stock FROM produits WHERE nom_produit = ?";
        PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
        selectStatement.setString(1, nom);
        ResultSet resultSet = selectStatement.executeQuery();

        if (resultSet.next()) {
            // Le produit existe déjà, augmenter la quantité en stock
            Scanner scanner = new Scanner(System.in);
            System.out.print("Quantité de produit à ajouter : ");
            int quantiteAjoutee = scanner.nextInt();
            int numeroProduit = resultSet.getInt("numero_produit");
            int ancienneQuantite = resultSet.getInt("quantite_stock");
            int nouvelleQuantite = ancienneQuantite + quantiteAjoutee;
            scanner.close();
            
            // Mettre à jour la quantité en stock dans la base de données
            String updateQuery = "UPDATE produits SET quantite_stock = ? WHERE numero_produit = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setInt(1, nouvelleQuantite);
            updateStatement.setInt(2, numeroProduit);
            updateStatement.executeUpdate();

            System.out.println("La quantité en stock du produit a été augmentée avec succès !");

        } else {    // Le produit n'existe pas encore, l'ajouter à la base de données avec la quantité spécifiée

            // Préparer la requête SQL pour insérer un nouveau produit
            String query = "INSERT INTO produits (nom_produit, description, type_produit, prix, pays_origine, pourcentage_tva, quantite_stock, nom_fournisseur ) VALUES (?, ?, ?, ?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            
            // Remplir les paramètres de la requête avec les valeurs du produit
            statement.setString(1, nom);
            statement.setString(2, description);
            statement.setString(3,typeProduit );
            statement.setDouble(4, prix);
            statement.setString(5, paysOrigine);
            statement.setDouble(6, getPourcentageTVA());
            statement.setInt(7, getQuantiteStock());
            statement.setString(8, nomFournisseur);

            // Exécuter la requête
            statement.executeUpdate();
        
            System.out.println("Le produit a été ajouté avec succès !");
    }
    } catch (SQLException e) {
        System.out.println("Erreur lors de l'ajout du produit : " + e.getMessage());
    }

} 
  
    public void saisieUtilisateur() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez les informations du produit :");
        
        
        System.out.print("Nom du produit : ");
        String pnom = scanner.nextLine();
        
        System.out.print("Description du produit : ");
        String pdescription = scanner.nextLine();

        System.out.print("Type du produit : ");
        String ptypeProduit = scanner.nextLine();
        
        System.out.print("Prix du produit : ");
        double pprix = scanner.nextDouble();

        scanner.nextLine(); // Vider la ligne restante

        System.out.print("pays d'origine du produit : ");
        String ppaysOrigine = scanner.nextLine();

        System.out.println("nom du fournisseur: ");
        String pnomFournisseur = scanner.next() ;
        
        // Appeler la méthode ajouterProduit avec les valeurs saisies
        ajouterProduit(pnom,pdescription, ptypeProduit, pprix,ppaysOrigine
        ,pnomFournisseur);
        scanner.close();
    }

    /**
     * Récupère les informations d'un produit à partir de son nom.
     *
     * @param nom le nom du produit à rechercher
     * @return le produit trouvé, ou null si aucun produit correspondant n'a été trouvé
     */
    public StockProduit rechercherProduitParNom(String nom) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LeadelMarche", "root", "")) {
            String query = "SELECT * FROM produits WHERE nom_produit = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nom);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int idProduit = resultSet.getInt("numero_produit");
                String description = resultSet.getString("description");
                String typeProduit = resultSet.getString("type_produit");
                double prix = resultSet.getDouble("prix");
                String paysOrigine = resultSet.getString("pays_origine");
                double pourcentageTVA = resultSet.getDouble("pourcentage_tva");
                int quantiteStock = resultSet.getInt("quantite_stock");
                String nomFournisseur = resultSet.getString("nom_fournisseur");

                return new StockProduit(idProduit, nom, description, typeProduit, prix, paysOrigine, pourcentageTVA,
                        quantiteStock, nomFournisseur);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche du produit : " + e.getMessage());
        }

        return null;
    }

    /**
     * Met à jour les informations d'un produit dans la base de données.
     *
     * @param produit le produit à mettre à jour
     */
    public void mettreAJourProduit(StockProduit produit) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LeadelMarche", "root", "")) {
            String query = "UPDATE produits SET description = ?, type_produit = ?, prix = ?, pays_origine = ?, " +
                    "pourcentage_tva = ?, quantite_stock = ?, nom_fournisseur = ? WHERE numero_produit = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, produit.getDescription());
            statement.setString(2, produit.getTypeProduit());
            statement.setDouble(3, produit.getPrix());
            statement.setString(4, produit.getPaysOrigine());
            statement.setDouble(5, produit.getPourcentageTVA());
            statement.setInt(6, produit.getQuantiteStock());
            statement.setString(7, produit.getNomFournisseur());
            statement.setInt(8, produit.getIdProduit());
            statement.executeUpdate();

            System.out.println("Le produit a été mis à jour avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la mise à jour du produit : " + e.getMessage());
        }
    }

    /**
     * Supprime un produit de la base de données.
     *
     * @param produit le produit à supprimer
     */
    public void supprimerProduit(StockProduit produit) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LeadelMarche", "root", "")) {
             String query = "DELETE FROM produits WHERE numero_produit = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, produit.getIdProduit());
            statement.executeUpdate();

            System.out.println("Le produit a été supprimé avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du produit : " + e.getMessage());
        }
    }
}







    