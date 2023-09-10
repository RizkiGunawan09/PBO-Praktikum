import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan string dan integer
        String[] text = new String[3];
        int[] arrayNumber = new int[3];

        // Variabel sementara untuk menyimpan input
        String word;
        int number;

        // Mengambil input dari pengguna sebanyak 3 kali
        for (int i = 0; i < 3; i++) {
            // Mengambil input string dan integer
            word = scanner.next();
            number = scanner.nextInt();

            // Menyimpan input ke dalam array
            text[i] = word;
            arrayNumber[i] = number;
        }

        // Mencetak header
        System.out.println("============================");

        // Mencetak hasil input dengan format tertentu
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s", text[i]); // String diatur lebar 15 karakter
            System.out.printf("%03d\n", arrayNumber[i]); // Integer diatur lebar 3 karakter dengan leading zero
        }

        // Mencetak footer
        System.out.println("============================");

        // Menutup objek Scanner untuk membebaskan sumber daya
        scanner.close();
    }
}
