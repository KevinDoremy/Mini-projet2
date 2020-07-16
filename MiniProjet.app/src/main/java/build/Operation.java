package build;


public class Operation implements Expression {

    String symbole;

    @Override
    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }

}