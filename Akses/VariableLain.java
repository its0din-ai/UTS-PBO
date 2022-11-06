package Akses;

public class VariableLain {
    public void printVariable() {
        Variable var = new Variable();
        System.out.println("\ndi Class yang berbeda ::");
        // System.out.println(var.prvt);
        System.out.println(var.dflt);
        System.out.println(var.prtd);
        System.out.println(var.pblc);

        System.out.println("kesimpulan :: \nPrivate Tidak dapat Diakses");
    }
}
