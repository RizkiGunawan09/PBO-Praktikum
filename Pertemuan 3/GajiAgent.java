import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gajiPokok = 500_000;  // Gaji pokok awal
        int hargaItem = 50_000;   // Harga setiap item yang dijual

        int jumlahItemDijual = scanner.nextInt();  // Meminta pengguna memasukkan jumlah item yang dijual

        if (jumlahItemDijual > 80) {
            // Jika jumlah item yang dijual lebih dari 80, maka agen mendapatkan komisi 35% dari total penjualan
            gajiPokok += (int) (0.35 * hargaItem * jumlahItemDijual);
        } else if (jumlahItemDijual >= 40) {
            // Jika jumlah item yang dijual dari 40 sampai dengan 80, agen mendapatkan komisi 25%
            gajiPokok += (int) (0.25 * hargaItem * jumlahItemDijual);
        } else if (jumlahItemDijual >= 15) {
            // Jika jumlah item yang dijual dari 15 sampai dengan 39, agen mendapatkan komisi 10%
            gajiPokok += (int) (0.10 * hargaItem * jumlahItemDijual);
        } else {
            // Jika jumlah item yang dijual kurang dari 15, agen dikenakan penalti sebesar 15% dari harga item untuk setiap item yang kurang dari 15
            gajiPokok -= (int) (0.15 * hargaItem * (15 - jumlahItemDijual));
        }

        System.out.println(gajiPokok);  // Menampilkan gaji total setelah perhitungan

        scanner.close();  // Menutup objek Scanner untuk membebaskan sumber daya
    }
}
