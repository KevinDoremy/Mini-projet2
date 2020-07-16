package build;

public class Nombre {
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public void accepterVisiteur(Visiteur visiteur) {
        visiteur.visit(this);
    }

    public int getValeur() {
        return valeur;
    }
}