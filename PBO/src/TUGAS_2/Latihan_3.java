package TUGAS_2;
import java.util.Scanner;
public class Latihan_3 {
	    
	    public static String hitungIndeks(int nilai) {
	        if (nilai >= 81 && nilai <= 100) {
	            return "A";
	        } else if (nilai >= 76 && nilai <= 80) {
	            return "AB";
	        } else if (nilai >= 56 && nilai <= 75) {
	            return "B";
	        } else if (nilai >= 51 && nilai <= 55) {
	            return "BC";
	        } else if (nilai >= 41 && nilai <= 50) {
	            return "C";
	        } else if (nilai >= 21 && nilai <= 40) {
	            return "D"; 
	        } else if (nilai >= 0 && nilai <= 20) {
	            return "E"; 
	        } else {
	            return "Nilai di luar jangkauan";
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Masukkan nilai matakuliah: ");

	        if(scanner.hasNextInt()) {
	            int nilai = scanner.nextInt();

	            if (nilai < 0 || nilai > 100) {
	                System.out.println("Nilai di luar jangkauan");
	            } else {
	                String indeks = hitungIndeks(nilai);
	                System.out.println("Indeks nilai: " + indeks);
	            }
	        } else {
	            System.out.println("Nilai harus diisi");
	        }

	        scanner.close();
	    }
	}