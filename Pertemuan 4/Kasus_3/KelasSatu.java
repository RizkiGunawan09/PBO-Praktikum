// Ini adalah definisi dari kelas KelasSatu.
public class KelasSatu {
    {
        // Blok inisialisasi instance (instance initializer block) yang mencetak 11.
        // Blok ini akan selalu ditampilkan ketika instansiasi object.
        System.out.println(11);
    }

    static {
        // Blok inisialisasi statis (static initializer block) yang mencetak 2.
        // Blok ini hanya ditampilkan sekali saat instansiasi object pertama kali.
        System.out.println(2);
    }

    // Konstruktor tanpa argumen yang mencetak 4 ketika objek KelasSatu dibuat.
    public KelasSatu() {
        System.out.println(4);
    }

    // Konstruktor dengan argumen yang mencetak 3 ketika objek KelasSatu dibuat dengan argumen.
    public KelasSatu(int i) {
        System.out.println(3);
    }
}
