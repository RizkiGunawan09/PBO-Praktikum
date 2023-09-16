// Definisi kelas Barang, yang merepresentasikan suatu barang dengan kode, nama, dan stok.
public class Barang {
    String kode_barang; // Variabel untuk menyimpan kode barang.
    String nama_barang; // Variabel untuk menyimpan nama barang.
    private int stok;   // Variabel stok yang dienkapsulasi.

    // Konstruktor untuk membuat objek Barang dengan menginisialisasi kode, nama, dan stok awal.
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Metode getter untuk mengambil nilai stok.
    public int getStok() {
        return stok;
    }

    // Metode untuk menambah stok barang jika nilai stok yang ditambahkan tidak negatif.
    public void addStok(int stok) {
        if (stok >= 0) {
            this.stok += stok;
        }
    }
}