package build;

public class Operation implements Noeud {

    String symbole;

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }

}