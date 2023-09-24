public class MenuItem {
    // Atribut-atribut untuk menyimpan informasi menu makanan
    private String name;
    private int price;
    private int stock;

    // Konstruktor class MenuItem
    public MenuItem(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Metode getter untuk mengakses nama
    public String getName() {
        return name;
    }

    // Metode getter untuk mengakses harga
    public int getPrice() {
        return price;
    }

    // Metode getter untuk mengakses stok
    public int getStock() {
        return stock;
    }

    // Metode setter untuk set nilai stock lama dengan stock baru
    public void setStok(int stock) {
        this.stock = stock;
    }
}
