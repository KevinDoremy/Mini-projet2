package build;

import javax.swing.RootPaneContainer;

/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {

        Noeud racine = new Noeud("+", null);
        racine.setDroit("*");
        racine.setGauche("/");

        //Ajoute les noeuds dans le noeud de multiplication
        racine.getGauche().setDroit("10");
        racine.getGauche().setGauche("5");
        
        //Ajoute les noeuds dans le noeud de division
        racine.getDroit().setDroit("2");
        racine.getDroit().setGauche("4");

        parcourirNoeudTest(racine);
    }

    public static void parcourirNoeudTest(Noeud noeud){

        while
    }
}
