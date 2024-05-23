package TUGAS_7.Latihan2;

public class Main {
    public static void main(String[] args) {
        KartuElektronik kartuElektronik = new KartuElektronik("IF111", "123");

        System.out.println("Otentikasi: " + kartuElektronik.otentikasi("123"));
    }
}