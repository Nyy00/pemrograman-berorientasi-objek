package TUGAS_6;

// Kelas Orang
public class orang1 {
    protected String nama;
    protected String alamat;

    // Konstruktor
    public orang1(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}

// Kelas Karyawan sebagai sub-class dari Orang
class Karyawan extends orang1 {
    // Atribut tambahan untuk karyawan
    private String jabatan;
    private double gaji;

    // Konstruktor
    public Karyawan(String nama, String alamat, String jabatan, double gaji) {
        super(nama, alamat); // Memanggil konstruktor dari super-class
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Getter dan setter untuk atribut tambahan
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Metode untuk menampilkan informasi karyawan
    public void infoKaryawan() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}