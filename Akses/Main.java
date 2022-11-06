package Akses;

import AksesBaru.*;

public class Main {
    public static void main(String[] args) {
        Variable var = new Variable();
        var.printVariable();

        VariableLain varLain = new VariableLain();
        varLain.printVariable();

        VariableTurunan varTurunan = new VariableTurunan();
        varTurunan.printVariable();

        VariablePublic varPublic = new VariablePublic();
        varPublic.printVariable();
    }
}
