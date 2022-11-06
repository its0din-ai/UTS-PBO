package AksesBaru;

import Akses.Variable;

public class VariableTurunan extends Variable {
    
    public void printVariable() {
        System.out.println("\ndi Package Berbeda, tetapi pada Class Turunannya ::");
        // System.out.println(prvt);
        // System.out.println(dflt);
        System.out.println(prtd);
        System.out.println(pblc);

        System.out.println("kesimpulan :: \nPrivate dan Default Tidak dapat diakses");
    }
}
