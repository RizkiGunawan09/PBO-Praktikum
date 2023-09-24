public class RestaurantMain {
    public static void main(String[] args) {
        // Membuat instance Restaurant
        Restaurant menu = new Restaurant();

        // Inisialisasi menu makanan, harga, dan stok
        menu.initializeMenu();

        // Menambahkan menu makanan
        menu.addNewMenu("Lontong", 5_000, 35);

        // Menampilkan menu makanan
        menu.showMenu();

        // Order menu dengan format:
        // Parameter ke-1: nomor menu
        // Parameter ke-2: jumlah menu yang dipesan
        menu.orderMenu(2, 30);
    }
}
