package build;

public class Multiplication extends Operation {

    static final String symbole = "*";

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        v.visit(this);
    }
}