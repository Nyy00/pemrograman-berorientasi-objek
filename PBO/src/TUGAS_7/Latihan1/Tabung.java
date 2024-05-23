package TUGAS_7.Latihan1;

public class Tabung extends Bentuk {
    private int tinggi;

    public Tabung() {
        super(0);
    }

    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * phi * jari2 * (jari2 + tinggi);
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}