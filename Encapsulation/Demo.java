package Encapsulation;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Actor actor1 = new Actor();
        
        System.out.print("Masukkan nama tokoh: ");
        actor1.setNama(inpt.nextLine());
        System.out.print("Masukkan nama film: ");
        actor1.setFilm(inpt.nextLine());
        inpt.close();

        System.out.println("Nama Tokoh: " + actor1.getNama());
        System.out.println("Nama Film: " + actor1.getFilm());
    }
}
