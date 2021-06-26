package iexpressions;

import interpreter.Identificable;
import model.IdentifierToken;

public class IdentifierExpression implements IExpression, Identificable {

    private IdentifierToken token;

    public IdentifierExpression(IdentifierToken token) {
        this.token = token;
    }

    public IdentifierToken getToken() {
        return token;
    }

    public void setToken(IdentifierToken token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "IdentifierExpression [" + this.token.getValue() + "]";
    }

    @Override
    public String getSymbolIdentifier() {
        return this.getToken().getValue();
    }

    @Override
    public String reportRepeated() {
        // return "The identifier expression " + this.getSymbolIdentifier() + " has been
        // declared";
        return "Not necessary";
    }

    public String reportNoDefinition() {
        return "The identifier expression " + this.getSymbolIdentifier() + " is not declared";
    }

}
