package TUGAS_7.Tugas;

public class PegawaiTetap extends KaryawanUmum {
    private double gajiBulanan; // Deklarasi variabel private untuk gaji bulanan

    public PegawaiTetap(String nama, int umur, double gajiBulanan) {
        super(nama, umur); // Memanggil konstruktor superclass untuk inisialisasi nama dan umur
        this.gajiBulanan = gajiBulanan; // Inisialisasi gaji bulanan
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan; // Implementasi metode hitungGaji, mengembalikan gaji bulanan
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + nama + ", Umur: " + umur + ", Gaji Bulanan: " + gajiBulanan); // Implementasi metode tampilkanInfo, menampilkan informasi pegawai tetap
    }
}
