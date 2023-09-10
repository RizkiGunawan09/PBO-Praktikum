import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        /* Split String yang berada dalam variabel text menjadi kumpulan String
         *  dengan aturan tertentu, lalu hasilnya di-assign ke variabel array of Strings yaitu tokens
         */
        String[] tokens = text.split("[ '!,?._@]+");

        // Menampilkan panjang elemen dari tokens
        System.out.println(tokens.length);

        // Menampilkan semua elemen dari tokens menggunakan for each
        for (String token : tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}
