package Tugas_3;

public class LingkaranMain {
    public static void main(String[] args) {
        // membuat variable l1 dan l2 dimana l2 mengacu ke l1
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        // menampilkan jari-jari l1 dan l2
        System.out.println(l1.getJariJari());
        System.out.println(l2.getJariJari());

        // mengubah jari-jari l2
        l2.setJariJari(10);

        // menampilkan jari-jari l1 dan l2
        System.out.println(l1.getJariJari());
        System.out.println(l2.getJariJari());
    }
}
