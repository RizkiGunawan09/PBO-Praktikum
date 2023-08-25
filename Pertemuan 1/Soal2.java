public class Soal2 { // nama class tersebut harus sama dengan nama file yaitu Soal2
    public static void main(String[] args) { // fungsi main untuk menjalankan program
        int i = 42; // Inisiasi variabel i bertipe int dengan assign 42
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        /**
         * Operasi di line 4 adalah Ternary Operator
         * Cek kondisi, jika i < 40, maka assign "life" ke variabel s bertipe String.
         * Jika tidak memenuhi kondisi pertama, maka cek kondisi kedua.
         * Jika i > 50, maka assign "universe" ke variabel s bertipe String.
         * Jika tidak memenuhi kondisi kedua, maka akan langsung assign "everything" ke variabel s bertipe String.
         */

        System.out.println(s); // menampilkan value dari s
    }
}
