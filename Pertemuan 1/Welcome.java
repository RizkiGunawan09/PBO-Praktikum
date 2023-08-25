public class Welcome { // nama class tersebut harus sama dengan nama file yaitu Welcome
    public static void main(String[] args) { // fungsi main untuk menjalankan program
        String greeting = "Welcome to Core Java!"; // Inisiasi variabel greeting bertipe String dengan assign "Welcome to Core Java!"
        System.out.println(greeting); // Menampilkan value dari variabel greeting
        for(int i = 0; i < greeting.length(); i++) { // for loop untuk menampilkan "=" sebanyak panjang dari String greeting yaitu 21
            System.out.print("="); // menampilkan "="
        }
        System.out.println(); // membuat line kosong
    }
}
