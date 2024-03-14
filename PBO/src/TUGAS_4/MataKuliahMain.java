package TUGAS_4;

public class MataKuliahMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Object", "B", 3);

        System.out.println("--- Daftar Matakuliah ---");
        System.out.println((mk1.display()));
        System.out.println((mk2.display()));
        System.out.println((mk3.display()));

        System.out.println("Nilai IPK");
        System.out.println("IPK: " + hitungIPK(new MataKuliah[]{mk1, mk2, mk3}));

    }

    static double hitungIPK(MataKuliah[] mk) {
        double totalSks = 0;
        double totalNilai = 0;
        for (MataKuliah matakuliah : mk) {
            totalSks += matakuliah.getSks();
            totalNilai += matakuliah.getSks() * matakuliah.nilaiIndex();
        }
        return totalNilai / totalSks;
    }
}
