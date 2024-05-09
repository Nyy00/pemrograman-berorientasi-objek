package TUGAS_6;

// Kelas inheritanceMain sebagai kelas utama untuk menjalankan program
public class inheritanceMain1 {
    public static void main(String[] args) {
        // Membuat objek Karyawan
        Karyawan karyawan = new Karyawan("Dony Laksmana", "Belitung", "Karyawan", 100000);

        // Menampilkan informasi karyawan
        karyawan.infoKaryawan();
    }
}