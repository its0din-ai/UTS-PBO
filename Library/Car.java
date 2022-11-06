package Library;

public class Car {
    String namaMobil;
    static int jumlahMobil;
    static final int jumlahRoda = 4;

    public Car(){
        System.out.println("Anda telah berhasil membuat sebuah objek");
    }

    String setNama(String nama){
        return namaMobil = nama;
    }

    static void setJumlahMobil(int jumlah){
        jumlahMobil = jumlah;
    }

    String getNama(){
        return namaMobil;
    }

    static int getJumlahMobil(){
        return jumlahMobil;
    }
    
}
