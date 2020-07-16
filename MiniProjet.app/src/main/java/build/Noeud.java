package build;

public class Noeud implements Expression {

    private String valeur;
    private Noeud droit;
    private Noeud gauche;
    private Noeud parent;

    public Noeud(String valeur, Noeud parent) {

        this.parent = parent;
        this.valeur = valeur;
        droit = null;
        gauche = null;
    }

    public void afficher() {

    }

    public void accepterVisiteur() {

    }

    public void setGauche(Noeud noeud, String valeur) {
        gauche = new Noeud(valeur, this);
    }

    public void setDroit(Noeud noeud, String valeur) {
        droit = new Noeud(valeur, this);
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }
}