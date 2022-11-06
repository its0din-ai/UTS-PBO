package AksesBaru;

import Akses.Variable;

public class VariablePublic {
    public void printVariable() {
        Variable var = new Variable();
        System.out.println("\ndi Package dan Class berbeda ::");
        // System.out.println(prvt);
        // System.out.println(dflt);
        // System.out.println(var.prtd);
        System.out.println(var.pblc);

        System.out.println("kesimpulan :: \nHanya Public yang dapat diakses");
    }
    
}
