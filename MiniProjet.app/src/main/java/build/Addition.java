package build;

public class Addition extends Operation {

    static final String symbole = "+";

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        v.visit(this);
    }
}