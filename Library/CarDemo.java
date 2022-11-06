package Library;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car mobil1 = new Car();

        mobil1.setNama("Toyota AE86");
        Car.setJumlahMobil(1);

        System.out.println("========================================================");
        System.out.println("Nama mobil: " + mobil1.getNama());
        System.out.println("Jumlah mobil: " + Car.getJumlahMobil());
        System.out.println("Roda :" + Car.jumlahRoda);
        System.out.println("-----------------------------------------");
        
        Car mobil2 = new Car();
        System.out.print("Masukkan nama mobil: ");
        String nama = input.nextLine();
        System.out.println("Ada berapa mobil? ");
        int jumlah = input.nextInt();
        mobil2.setNama(nama);
        Car.setJumlahMobil(jumlah);
        
        System.out.println("========================================================");
        System.out.println("Nama mobil: " + mobil1.getNama());
        System.out.println("Jumlah mobil: " + Car.getJumlahMobil());
        System.out.println("Roda :" + Car.jumlahRoda);

        input.close();

    }
}
