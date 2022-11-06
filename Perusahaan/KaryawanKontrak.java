package Perusahaan;

public class KaryawanKontrak {
    final double gajiPerHari = 75000;
    int hariKerja;

    void setKehadiran(int hadir){
        this.hariKerja = hadir;
    }

    double getTotalGaji(){
        return gajiPerHari * hariKerja;
    }
}
