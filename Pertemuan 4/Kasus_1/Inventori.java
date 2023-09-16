// Definisi kelas Inventori, yang mengelola beberapa objek Barang dan melakukan pengadaan stok.
public class Inventori {
    Barang[] barangs; // Array untuk menyimpan objek-objek Barang.

    // Metode ini digunakan untuk menginisialisasi objek-objek Barang dalam array.
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Metode ini digunakan untuk menampilkan informasi tentang barang-barang dalam array.
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }

    // Metode ini digunakan untuk melakukan pengadaan stok dan menampilkan informasi setelah pengadaan.
    void pengadaan() {
        initBarang();
        barangs[0].addStok(20);
        showBarang();
    }

    // Metode utama yang menciptakan objek Inventori dan melakukan pengadaan stok.
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan(); // Membuat objek Inventori dan melakukan pengadaan stok.
    }
}
