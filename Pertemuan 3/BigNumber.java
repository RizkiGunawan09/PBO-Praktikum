import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua angka sebagai string
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Konversi dua string tersebut menjadi objek BigInteger
        BigInteger bigNumber1 = new BigInteger(a);
        BigInteger bigNumber2 = new BigInteger(b);

        // Proses penambahan dan perkalian menggunakan BigInteger
        BigInteger adding = bigNumber1.add(bigNumber2);
        BigInteger multiplying = bigNumber1.multiply(bigNumber2);

        // Output hasil tanpa leading zeros
        System.out.println(adding);
        System.out.println(multiplying);

        scanner.close();
    }
}
