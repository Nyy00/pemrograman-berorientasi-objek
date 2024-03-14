package TUGAS_4;

public class GelasMain {
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        tukarWarna(g1, g2);

        System.out.println("Gelas 1: " + g1.getWarna());
        System.out.println("Gelas 2: " + g2.getWarna());
    }

    static void tukarWarna(Gelas g1, Gelas g2) {
        Gelas temp = new Gelas("temp");

        temp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(temp.getWarna());
    }
}