// Ini adalah definisi kelas Item, yang memiliki variabel name dan dua konstruktor.

public class Item {
    private String name; // Variabel name untuk menyimpan nama Item.

    // Konstruktor pertama yang bersifat private, digunakan untuk menginisialisasi name ke "Ipin".
    private Item() {
        name = "Ipin";
    }

    // Konstruktor kedua yang menerima sebuah argumen nama, memanggil konstruktor private,
    // dan mencetak nama Item ke konsol.
    public Item(String name) {
        this(); // Memanggil konstruktor private untuk menginisialisasi name ke "Ipin".
        System.out.println(this.name); // Mencetak nama Item ke konsol.
    }
}
