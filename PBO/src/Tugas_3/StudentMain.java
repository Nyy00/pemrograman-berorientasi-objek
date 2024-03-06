package Tugas_3;

public class StudentMain {
    public static void main(String[] args) {
        // membuat variable x dan y dimana y mengacu ke x
        Student x = new Student();
        Student y = x;

        // melakukkan setNrp pada x dan y
        x.setNrp("01");
        y.setNrp("02");

        // menampilkan nrp x
        System.out.println(x.getNrp());

        // membuat variaable z
        Student z = new Student();

        // melakukkan setNrp pada z
        z.setNrp("03");

        // mengubah referensi x dengan z
        x = z;

        // menampilkan nrp x dan z
        System.out.println(x.getNrp());
        System.out.println(z.getNrp());
    }
}