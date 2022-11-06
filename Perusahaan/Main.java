package Perusahaan;

public class Main {
    public static void main(String[] args) {
        KaryawanKontrak id0537 = new KaryawanKontrak();
        Spv spv1 = new Spv();
        Staff staff1 = new Staff();
        Manager mngr1 = new Manager();

        id0537.setKehadiran(20);

        spv1.setJamLembur(10);
        spv1.setManage(5);
        staff1.setJamLembur(5);
        mngr1.setJamLembur(5);
        mngr1.setJmlProject(2);
        mngr1.setJmlSpv(2);
        mngr1.setJmlStf(5);

        System.out.println("+--------------------------------------------------------+");
        
        System.out.println("  Gaji Manager = " + mngr1.getTotalGaji() + "\n  Gaji Supervisor = " + spv1.getTotalGaji() + 
                "\n  Gaji Staff = " + staff1.getTotalGaji() +  "\n  Gaji Karyawan Kontrak = " + id0537.getTotalGaji());

        System.out.println("+--------------------------------------------------------+");
    }
}
