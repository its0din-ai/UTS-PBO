package Akses;

public class Variable {
    private String prvt = "Ini adalah Private Variable";
    String dflt = "Ini adalah Default Variable";
    protected String prtd = "Ini adalah Protected Variable";
    public String pblc = "Ini adalah Public Variable";

    public void printVariable() {
        System.out.println("\ndi Class itu sendiri::");
        System.out.println(prvt);
        System.out.println(dflt);
        System.out.println(prtd);
        System.out.println(pblc);

        System.out.println("kesimpulan :: \nSemua Access Modifier dapat diakses");
    }
}
