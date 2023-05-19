package Vue;

import Model.StockProduit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Cette classe représentant une interface graphique pour la gestion des produits.
 */
public class InterfaceStockProduit extends JFrame {
    private JTextField productNameField;
    private JTextField productDescriptionField;
    private JTextField productTypeField;
    private JTextField productPriceField;
    private JTextField productOriginField;
    private JTextField productSupplierField;

    private StockProduit stockProduit;

    /**
     * Constructeur de la classe InterfaceStockProduit.
     * Initialise les composants de l'interface graphique.
     */
    public InterfaceStockProduit() {
        stockProduit = new StockProduit();

        setTitle("Gestion des produits");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 2, 10, 10));

        JLabel productNameLabel = new JLabel("Nom du produit:");
        productNameField = new JTextField();
        mainPanel.add(productNameLabel);
        mainPanel.add(productNameField);

        JLabel productDescriptionLabel = new JLabel("Description du produit:");
        productDescriptionField = new JTextField();
        mainPanel.add(productDescriptionLabel);
        mainPanel.add(productDescriptionField);
        JLabel productTypeLabel = new JLabel("Type du produit:");
        productTypeField = new JTextField();
        mainPanel.add(productTypeLabel);
        mainPanel.add(productTypeField);

        JLabel productPriceLabel = new JLabel("Prix du produit:");
        productPriceField = new JTextField();
        mainPanel.add(productPriceLabel);
        mainPanel.add(productPriceField);

        JLabel productOriginLabel = new JLabel("Pays d'origine du produit:");
        productOriginField = new JTextField();
        mainPanel.add(productOriginLabel);
        mainPanel.add(productOriginField);

        JLabel productSupplierLabel = new JLabel("Nom du fournisseur:");
        productSupplierField = new JTextField();
        mainPanel.add(productSupplierLabel);
        mainPanel.add(productSupplierField);

        JButton addButton = new JButton("Ajouter le produit");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
        mainPanel.add(new JLabel());
        mainPanel.add(addButton);

        setContentPane(mainPanel);
    }

    /**
     * Méthode appelée lors du clic sur le bouton "Ajouter le produit".
     * Récupère les données saisies dans les champs de texte et ajoute le produit à la base de données.
     */
    private void addProduct() {
        String productName = productNameField.getText();
        String productDescription = productDescriptionField.getText();
        String productType = productTypeField.getText();
        double productPrice = Double.parseDouble(productPriceField.getText());
        String productOrigin = productOriginField.getText();
        String productSupplier = productSupplierField.getText();

        stockProduit.ajouterProduit(productName, productDescription, productType, productPrice,
                productOrigin, productSupplier);

        JOptionPane.showMessageDialog(this, "Le produit a été ajouté avec succès !");

        // Réinitialiser les champs de saisie
        productNameField.setText("");
        productDescriptionField.setText("");
        productTypeField.setText("");
        productPriceField.setText("");
        productOriginField.setText("");
        productSupplierField.setText("");

    }
}