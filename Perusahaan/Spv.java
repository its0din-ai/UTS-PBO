package Perusahaan;

public class Spv extends KaryawanTetap {
    final double gajiLembur = 40000;
    final double manageStaff = 60000;
    int jamLembur;
    int jumlahStaff;

    void setManage(int jumlahStaff) {
        this.jumlahStaff = jumlahStaff;
    }

    void setJamLembur(int jam) {
        this.jamLembur = jam;
    }

    double getTotalGaji(){
        return gajiPokok + (gajiLembur * jamLembur) + (manageStaff * jumlahStaff);
    }

}
