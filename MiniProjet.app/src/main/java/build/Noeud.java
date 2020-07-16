package build;

public class Noeud {

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

    public void accepterVisiteur(Visiteur visiteur) {
    }

    public void setGauche(String valeur) {
        gauche = new Noeud(valeur, this);
    }

    public void setDroit(String valeur) {
        droit = new Noeud(valeur, this);
    }

    public Noeud getParent(){
        return parent;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }

    public boolean hasChildren(){
        return (gauche != null || droit != null) ? true : false;
    }

    public boolean hasNoeudGauche(){
        return (gauche != null) ? true : false;
    }

    public boolean hasNoeudDroit(){
        return (droit != null) ? true : false;
    }

    public String getValeur(){
        return valeur;
    }
}