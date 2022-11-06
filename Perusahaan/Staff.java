package Perusahaan;

public class Staff extends KaryawanTetap {
    final double gajiLembur = 30000;
    int jamLembur;

    void setJamLembur(int jam) {
        this.jamLembur = jam;
    }

    double getTotalGaji(){
        return gajiPokok + (gajiLembur * jamLembur);
    }

}

