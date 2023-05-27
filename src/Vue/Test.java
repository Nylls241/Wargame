package Vue;

public class Test{
    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
            }
        });
    }*/
  public static void main(String[] args) {
        /**
         * Affiche la fenêtre du plateau
         * 
         */
        InterfacePlateau interfacePlateau = new InterfacePlateau();
        interfacePlateau.setVisible(true);

        
        /**
         * 
         * Affiche le menu principal 
         */
       //MainMenu mainMenu = new MainMenu();
       //mainMenu.setVisible(true);
    }

}
