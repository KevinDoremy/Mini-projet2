package build;

public abstract class Operation extends Noeud implements Expression {

    Expression expression, expression2;

    public Operation(Expression expression, Expression expression2) {
        this.expression = expression;
        this.expression2 = expression2;
    }

}