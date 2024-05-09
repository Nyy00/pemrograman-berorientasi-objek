package TUGAS_6;

// Kelas Orang
public class orang {
    protected String nama;
    protected String alamat;

    // Konstruktor
    public orang(String nama, String alamat) {
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

// Kelas Mahasiswa sebagai sub-class dari Orang
class Mahasiswa extends orang {
    // Konstruktor
    private String nrp;

    public Mahasiswa(String nrp, String nama, String alamat) {
        super(nama,alamat); // Memanggil konstruktor dari super-class
        setNrp(nrp);
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
}
