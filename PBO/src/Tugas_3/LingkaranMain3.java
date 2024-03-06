package Tugas_3;

public class LingkaranMain3 {
    public static void main(String[] args) {
        // membuat variable l1, l2, dan l3 dimana l2 mengacu ke l1
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);

        // menampilkan jari-jari l1, l2, dan l3
        System.out.println(l1.getJariJari());
        System.out.println(l2.getJariJari());
        System.out.println(l3.getJariJari());

        // menghapus referensi l1, l2, dan l3 dengan mereferensikan null
        l1 = null;
        l2 = null;
        l3 = null;
    }
}