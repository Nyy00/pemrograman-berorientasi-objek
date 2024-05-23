package TUGAS_7.Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek pegawai tetap
        Karyawan pegawaiTetap = new PegawaiTetap("Dony", 20, 5000000);
        // Membuat objek pegawai kontrak
        Karyawan pegawaiKontrak = new PegawaiKontrak("Rafi", 22, 200000, 20);

        // Menjalankan metode bekerja untuk pegawai tetap
        pegawaiTetap.bekerja();
        // Menampilkan informasi pegawai tetap
        pegawaiTetap.tampilkanInfo();
        // Menambahkan baris kosong untuk pemisah output
        System.out.println();
        // Menjalankan metode bekerja untuk pegawai kontrak
        pegawaiKontrak.bekerja();
        // Menampilkan informasi pegawai kontrak
        pegawaiKontrak.tampilkanInfo();
    }
}
