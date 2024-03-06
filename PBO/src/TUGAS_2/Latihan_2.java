package TUGAS_2;
import java.util.Scanner;
public class Latihan_2 {

    private double panjang;
    private double lebar;

    public Latihan_2(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + String.format("%.0f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.0f", hitungKeliling()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        Latihan_2 persegi = new Latihan_2(panjang, lebar);

        persegi.tampil();
        scanner.close();
    }
}

