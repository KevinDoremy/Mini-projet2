package build;

public class Noeud implements Expression {

    private String valeur;
    private Noeud droit;
    private Noeud gauche;

    public Noeud(String valeur) {

        this.valeur = valeur;
        droit = null;
        gauche = null;
    }

    public void afficher() {

    }

    public void accepterVisiteur() {

    }

    public void setGauche(Noeud noeud, String valeur) {
        gauche = new Noeud(String valeur);
    }

    public void setDroit(Noeud noeud, String valeur) {
        droit = new Noeud(String valeur);
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }
}