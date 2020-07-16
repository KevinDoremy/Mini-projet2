package build;

/**
 * 
 *
 */
public class App {
    public static void main(String[] args) {

        Noeud racine = new Noeud("+", null);
        racine.setDroit("/");
        racine.setGauche("*");

        //Ajoute les noeuds dans le noeud de multiplication
        racine.getGauche().setDroit("10");
        racine.getGauche().setGauche("5");
        
        //Ajoute les noeuds dans le noeud de division
        racine.getDroit().setDroit("2");
        racine.getDroit().setGauche("4");
    }
}
