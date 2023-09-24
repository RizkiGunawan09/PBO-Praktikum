import java.util.ArrayList;

public class Restaurant {
    // ArrayList untuk menyimpan menu makanan
    private ArrayList<MenuItem> menuItems;

    // Konstruktor class Restaurant
    public Restaurant() {
        // Inisialisasi ArrayList untuk menu makanan
        menuItems = new ArrayList<>();
    }

    // Metode untuk menambahkan menu makanan baru ke ArrayList
    public void addNewMenu(String name, int price, int stock) {
        // Membuat objek MenuItem dan menambahkannya ke ArrayList
        MenuItem newItem = new MenuItem(name, price, stock);
        menuItems.add(newItem);
    }

    // Metode untuk menginisialisasi menu makanan, harga, dan stok
    public void initializeMenu() {
        addNewMenu("Bala-bala", 1_000, 20);
        addNewMenu("Gehu", 2_000, 25);
        addNewMenu("Tahu", 3_000, 0);
        addNewMenu("Molen", 4_000, 30);
    }

    // Metode untuk memeriksa apakah item-menu makanan habis (out of stock)
    public boolean isOutOfStock(int index) {
        return menuItems.get(index).getStock() == 0;
    }

    // Metode untuk menghitung total harga setelah memesan makanan
    public int calculatePrice(int inputMenu, int quantity) {
        int index = 0;
        for(MenuItem item:menuItems){
            if(item.getStock() == 0)
                continue;

            if(index == inputMenu) {
                item.setStok(item.getStock() - quantity);
                return item.getPrice() * quantity;
            }

            index++;
        }

        return 0;
    }

    public int searchIndex(int indexMenu) {
        int index = -1, gap = 0;
        for(MenuItem item:menuItems){
            System.out.println("index = " + index);
            System.out.println("gap = " + gap);
            if(index+gap == indexMenu)
                break;

            if(item.getStock() == 0)
                gap++;

            index++;
        }

        System.out.println("hasilnya = " + (index+gap));
        return index + gap;
    }

    // Metode untuk menghitung jumlah menu dengan stok tidak 0
    public int totalAvailableMenu() {
        int total = 0;
        for(MenuItem item:menuItems){
            if(item.getStock() == 0)
                continue;
            total++;
        }

        return total;
    }

    // Metode untuk mendapat stok yang tersedia berdasarkan menu yang dipilih
    public int totalAvailableStock(int indexMenu) {
        return menuItems.get(searchIndex(indexMenu)).getStock();
    }

    // Metode untuk memesan menu makanan dengan mengurangi stok
    public void orderMenu(int menu, int quantity) {
        if(menu > totalAvailableMenu() || menu < 1) {
            System.out.println("Nomor menu tidak valid");
            return;
        }

        if(quantity < 1){
            System.out.println("Minimal jumlah menu 1");
            return;
        }

        if(quantity > totalAvailableStock(menu)){
            System.out.println("Jumlah menu melebihi stok yang tersedia");
            return;
        }

        int prices = calculatePrice(menu - 1, quantity);
        System.out.println("Total harga = " + prices);
    }

    // Metode untuk menampilkan menu makanan
    public void showMenu() {
        System.out.println("=======================================");
        System.out.println("|No.|   Daftar Menu   |     Harga     |");
        System.out.println("=======================================");
        int index = 0, no = 1;
        for(MenuItem item : menuItems) {
            if(!isOutOfStock(index)) {
                String text = "| " + (no) + " |" + item.getName() + "[" + item.getStock() + "]";
                System.out.printf("%-22s", text);
                System.out.println("|  " + " Rp. " + item.getPrice() + "    |");
                no++;
            }
            index++;
        }
        System.out.println("=======================================");
    }
}
