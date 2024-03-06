package TUGAS_2;

import java.util.Scanner;
public class Latihan_1 {

	    private double panjang;
	    private double lebar;

	    public Latihan_1(double panjang, double lebar) {
	        this.panjang = panjang;
	        this.lebar = lebar;
	    }

	    public double hitungLuas() {
	        return panjang * lebar;
	    }

	    public double hitungKeliling() {
	        return 2 * (panjang + lebar);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Panjang: ");
	        double panjang = scanner.nextInt();

	        System.out.print("Lebar: ");
	        double lebar = scanner.nextInt();

	        Latihan_1 persegi = new Latihan_1(panjang, lebar);

	        System.out.println("Luas: " + String.format("%.0f", persegi.hitungLuas()));
	        System.out.println("Keliling: " + String.format("%.0f", persegi.hitungKeliling()));

	        scanner.close();
	    }
	}


