import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input number: ");
            String inputString = input.nextLine();
            long number;

            try {
                number = Long.parseLong(inputString); // Mengonversi input menjadi long
                String result = number + " can be fitted in:";

                // Memeriksa apakah nilai masukan cocok dengan tipe byte
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
                    result += "\n* byte";

                // Memeriksa apakah nilai masukan cocok dengan tipe short
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
                    result += "\n* short";

                // Memeriksa apakah nilai masukan cocok dengan tipe int
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
                    result += "\n* int";

                // Menambahkan tipe long selalu karena long memiliki rentang nilai terbesar
                result += "\n* long";

                // Menampilkan hasil
                System.out.println(result);
            } catch (NumberFormatException e) {
                // Menangani kesalahan jika input tidak dapat diurai sebagai long
                System.out.println(inputString + " can't be fitted anywhere");
            }

            System.out.print("Apakah ingin input lagi (y/n): ");
            String ulang = input.nextLine();
            if (ulang.equalsIgnoreCase("n"))
                break;
        }

        // Menutup scanner setelah selesai
        input.close();
    }
}
