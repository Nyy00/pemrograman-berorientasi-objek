package TEST;

import TUGAS_7.Latihan1.Bentuk;
import TUGAS_7.Latihan1.Lingkaran;
import TUGAS_7.Latihan1.Tabung;

public class Test {
     public static void main(String[] args) {
        // Membuat objek dari kelas Bentuk
        Bentuk bentuk1 = new Lingkaran(5);
        Bentuk bentuk2 = new Tabung(3, 7);

        // Memanggil metode hitungLuas() pada objek Bentuk
        // Polimorfisme terjadi di sini
        double luas1 = bentuk1.hitungLuas();
        double luas2 = bentuk2.hitungLuas();

        // Menampilkan hasil perhitungan luas
        System.out.println("Luas Lingkaran: " + luas1);
        System.out.println("Luas Tabung: " + luas2);
    }
}

