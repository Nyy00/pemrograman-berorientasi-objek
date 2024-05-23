package TUGAS_7.Tugas;

public class PegawaiKontrak extends KaryawanUmum {
    private double gajiHarian; // Deklarasi variabel private untuk gaji harian
    private int jumlahHariKerja; // Deklarasi variabel private untuk jumlah hari kerja

    public PegawaiKontrak(String nama, int umur, double gajiHarian, int jumlahHariKerja) {
        super(nama, umur); // Memanggil konstruktor superclass untuk inisialisasi nama dan umur
        this.gajiHarian = gajiHarian; // Inisialisasi gaji harian
        this.jumlahHariKerja = jumlahHariKerja; // Inisialisasi jumlah hari kerja
    }

    @Override
    // Implementasi metode hitungGaji, mengalikan gaji harian dengan jumlah hari kerja
    public double hitungGaji() {
        return gajiHarian * jumlahHariKerja; 
    }

    @Override
    // Implementasi metode tampilkanInfo, menampilkan informasi pegawai kontrak
    public void tampilkanInfo() {
        System.out.println("Pegawai Kontrak: " + nama + ", Umur: " + umur + ", Gaji Harian: " 
                            + gajiHarian + ", Jumlah Hari Kerja: " 
                            + jumlahHariKerja + ", Gaji Total: " + hitungGaji());
    }
}
