package Encapsulation;

public class Actor {
    private String namaTokoh;
    private String namaFilm;

    String setNama(String nama) {
        return this.namaTokoh = nama;
    }

    String setFilm(String film) {
        return this.namaFilm = film;
    }

    String getNama() {
        return this.namaTokoh;
    }

    String getFilm() {
        return this.namaFilm;
    }
}
