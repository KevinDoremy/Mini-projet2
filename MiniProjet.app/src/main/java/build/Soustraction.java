package build;

/**
 * Soustraction
 */
public class Soustraction extends Operation {

    static final String symbole = "-";

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }
}