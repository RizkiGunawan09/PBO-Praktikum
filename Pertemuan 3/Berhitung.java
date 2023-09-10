import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input angka pertama, operator, dan angka kedua dalam satu baris yang dipisahkan oleh spasi
        int firstNumber = scanner.nextInt();  // Membaca angka pertama
        String operator = scanner.next();     // Membaca operator
        int secondNumber = scanner.nextInt(); // Membaca angka kedua

        // Memeriksa apakah angka berada dalam interval yang valid (1 <= firstNumber, secondNumber <= 1000)
        if (firstNumber < 1 || firstNumber > 1000 || secondNumber < 1 || secondNumber > 1000) {
            System.out.println("Angka tidak sesuai interval (1 <= firstNumber, secondNumber <= 1000)");
        } else {
            // Menggunakan switch-case untuk mengevaluasi operator
            switch (operator) {
                case "+" -> System.out.println(firstNumber + secondNumber);  // Penjumlahan
                case "-" -> System.out.println(firstNumber - secondNumber);  // Pengurangan
                case "*" -> System.out.println(firstNumber * secondNumber);  // Perkalian
                case "/" -> {
                    // Memeriksa apakah angka pertama habis dibagi oleh angka kedua
                    if (firstNumber % secondNumber != 0) {
                        System.out.println("Angka pertama tidak habis dibagi oleh angka kedua");
                    } else {
                        System.out.println(firstNumber / secondNumber);  // Pembagian
                    }
                }
                case "%" -> System.out.println(firstNumber % secondNumber);  // Modulus
                default -> System.out.println("Operator tidak valid!");  // Operator tidak valid
            }
        }

        // Menutup objek Scanner untuk membebaskan sumber daya
        scanner.close();
    }
}
