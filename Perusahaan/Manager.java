package Perusahaan;

public class Manager extends KaryawanTetap {
    final double gajiLembur = 50000;
    final double gajiProject = 1000000;
    final double manageSpv = 100000;
    final double manageStaff = 60000;
    int jamLembur;
    int jmlProject;
    int jmlSpv;
    int jmlStf;

    void setJamLembur(int jam){
        this.jamLembur = jam;
    }

    void setJmlProject(int jmlProject){
        this.jmlProject = jmlProject;
    }

    void setJmlSpv(int jmlSpv){
        this.jmlSpv = jmlSpv;
    }

    void setJmlStf(int jmlStf){
        this.jmlStf = jmlStf;
    }

    double getTotalGaji(){
        return gajiPokok + (gajiLembur * jamLembur) + (gajiProject * jmlProject) + (manageSpv * jmlSpv) + (manageStaff * jmlStf);
    }
}
