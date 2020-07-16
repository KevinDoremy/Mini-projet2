package build;

public interface Visiteur {

    public void visit(Operation operation);

    public void visit(Nombre nombre);
}