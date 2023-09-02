import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca dua input String dari pengguna
        String A = input.nextLine(); // Membaca input pertama
        String B = input.nextLine(); // Membaca input kedua

        // Menghitung jumlah panjang kedua String
        int sumOfLengths = A.length() + B.length();
        System.out.println(sumOfLengths); // Mencetak jumlah panjang String

        // Membandingkan dua String secara lexicographically (berdasarkan urutan kamus)
        if (A.compareTo(B) > 0) {
            System.out.println("Yes"); // Jika A lebih besar, mencetak "Yes"
        } else {
            System.out.println("No"); // Jika B lebih besar atau sama, mencetak "No"
        }

        // Mengkapitalisasi huruf pertama dari masing-masing String dan mencetak hasilnya
        String capitalizedA = capitalizeFirstLetter(A); // Memanggil fungsi capitalizeFirstLetter untuk A
        String capitalizedB = capitalizeFirstLetter(B); // Memanggil fungsi capitalizeFirstLetter untuk B
        System.out.println(capitalizedA + " " + capitalizedB);

        input.close(); // Menutup scanner setelah selesai
    }

    // Fungsi untuk mengkapitalisasi huruf pertama dari sebuah String
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Mengembalikan input tanpa perubahan jika input kosong atau null
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1); // Mengkapitalisasi huruf pertama
    }
}