// Ini adalah definisi dari kelas KelasDua.
public class KelasDua {
    {
        // Blok inisialisasi instance (instance initializer block) yang mencetak 5.
        System.out.println(5);
    }

    public static void main(String[] args) {
        // Mencetak 6 ke konsol.
        System.out.println(6);
        // Membuat objek KelasSatu tanpa argumen, mencetak 4 (konstruktor default).
        KelasSatu satu = new KelasSatu();
        // Membuat objek KelasSatu dengan argumen 10, mencetak 3 (konstruktor dengan argumen).
        KelasSatu dua = new KelasSatu(10);
    }
}
