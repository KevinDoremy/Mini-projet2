package build;

public class Division extends Operation {

    static final String symbole = "/";

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }
}
