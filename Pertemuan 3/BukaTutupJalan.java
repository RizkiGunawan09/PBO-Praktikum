import java.util.Scanner;

public class BukaTutupJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String platNomor = scanner.nextLine();  // Membaca plat nomor kendaraan dari pengguna

        String[] platNomorPisah = platNomor.split(" ");  // Memisahkan plat nomor menjadi bagian-bagian

        String platNomorGabung = "";
        for(String buffer : platNomorPisah)
            platNomorGabung += buffer;

        long angka = Long.parseLong(platNomorGabung);  // Mengubah plat nomor menjadi angka

        angka = (angka - 999_999) % 5;  // Menghitung sisa pembagian angka dengan 5 setelah mengurangkan 999,999

        if (angka != 0) {
            // Jika sisa pembagian angka bukan 0, maka kendaraan harus berhenti
            System.out.println("berhenti");
        } else {
            // Jika sisa pembagian angka adalah 0, maka kendaraan boleh melanjutkan perjalanan
            System.out.println("jalan");
        }

        scanner.close();  // Menutup objek Scanner untuk membebaskan sumber daya
    }
}
