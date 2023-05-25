package Vue;
import javax.swing.SwingUtilities;

public class TestInterfaceGraphique {
     /**
     * Méthode principale pour tester nos interfaces graphique.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfacePlateau interfacePlateau = new InterfacePlateau();
            interfacePlateau.setVisible(true);
        });
    }
}
