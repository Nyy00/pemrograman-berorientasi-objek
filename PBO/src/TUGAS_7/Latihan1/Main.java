package TUGAS_7.Latihan1;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        Tabung tabung = new Tabung(10, 5);

        System.out.println("== Lingkaran ==");
        System.out.println("Jari-jari: " + lingkaran.getJari2());
        System.out.println("Luas: " + lingkaran.hitungLuas());

        System.out.println("== Tabung ==");
        System.out.println("Jari-jari: " + tabung.getJari2());
        System.out.println("Tinggi: " + tabung.getTinggi());
        System.out.println("Luas: " + tabung.hitungLuas());
    }
}