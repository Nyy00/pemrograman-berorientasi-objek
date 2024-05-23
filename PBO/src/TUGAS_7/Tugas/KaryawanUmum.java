package TUGAS_7.Tugas;

public abstract class KaryawanUmum implements Karyawan {
    protected String nama; // Deklarasi variabel protected untuk nama karyawan
    protected int umur; // Deklarasi variabel protected untuk umur karyawan

    public KaryawanUmum(String nama, int umur) {
        this.nama = nama; // Inisialisasi nama karyawan
        this.umur = umur; // Inisialisasi umur karyawan
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja."); // Implementasi metode bekerja dari interface Karyawan
    }

    @Override
    public abstract double hitungGaji(); // Deklarasi metode abstrak untuk menghitung gaji, implementasinya ada di subkelas
    
    @Override
    public abstract void tampilkanInfo(); // Deklarasi metode abstrak untuk menampilkan informasi, implementasinya ada di subkelas
}

