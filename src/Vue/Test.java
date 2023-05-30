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
        //InterfacePlateau interfacePlateau = new InterfacePlateau();
        //interfacePlateau.setVisible(true);
        
        /**
         * 
         * Affiche le menu principal 
         */
        MainMenu mainMenu = new MainMenu();
// ...
// Utilisation des getters pour récupérer les pseudos
String pseudo1 = mainMenu.getPseudo1();
String pseudo2 = mainMenu.getPseudo2();
System.out.println(pseudo2);
System.out.println(pseudo1);
mainMenu.setVisible(true);
// Utilisation des pseudos dans votre logique de jeu


    }



}
