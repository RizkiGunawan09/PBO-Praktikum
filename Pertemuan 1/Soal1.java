public class Soal1 { // nama class tersebut harus sama dengan nama file yaitu Soal1
    public static void main(String[] args) { // fungsi main untuk menjalankan program
        byte angka1 = 125; // Inisiasi variabel angka1 bertipe byte dengan assign 125
        byte angka2 = 6; // Inisiasi variabel angka2 bertipe byte dengan assign 6
        byte hasil = (byte) (angka1 + angka2);
        // Inisiasi variabel hasil bertipe byte dengan assign angka1+angka2, lalu casting ke byte dan di-assign ke variabel hasil

        System.out.println("Hasil 1 " + hasil); // menampilkan output dari hasil
    }
}
