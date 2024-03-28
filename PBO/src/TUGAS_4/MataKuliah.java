package TUGAS_4;

public class MataKuliah {

private String kode;
private String nama;
private String indeks;
private int sks;

public MataKuliah(String kode, String nama, String indeks, int sks) {
    super();

    this.kode = kode;
    this.nama = nama;
    this.indeks = indeks;
    this.sks = sks;
}
public int getSks() {
    return sks;
}
public double nilaiIndex() {
    return switch (indeks) {
        case "A" -> 4;
        case "AB" -> 3.5;
        case "B" -> 3;
        case "BC" -> 2.5;
        case "C" -> 2;
        case "D" -> 1;
        default -> 0.0;
    };
}
public String display() {
    return kode + " - " + nama + " - " + indeks;
}
}