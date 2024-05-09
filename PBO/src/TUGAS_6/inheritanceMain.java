package TUGAS_6;

// Kelas inheritanceMain sebagai kelas utama untuk menjalankan program
public class inheritanceMain {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("223040103" , "Dony Laksmana" , "Belitung");

        // Menampilkan nama mahasiswa
        System.out.println(mhs.getNrp() +
                        "-" + mhs.getNama() + 
                        "-" + mhs.getAlamat());
    }
}
