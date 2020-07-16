package build;

public class Multiplication extends Operation {

    static final String symbole = "*";

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }

    public static String getSymbole() {
        return symbole;
    }
}