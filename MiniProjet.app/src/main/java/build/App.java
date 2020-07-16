package build;

import javax.swing.RootPaneContainer;

/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {

        Noeud racine = new Noeud("+", null);
        racine.setDroit(Noeud multiplication = new Noeud(""));
        racine.setGauche("*", racine);
        

    }
}
