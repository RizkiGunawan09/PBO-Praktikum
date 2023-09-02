class ConvertDataType {
    // Metode static methodOne menerima argumen long dan mengembalikan tipe data short.
    static short methodOne(long l) {
        int i = (int) l; // Mengonversi nilai long l menjadi tipe data int i.
        return (short)i; // Mengonversi nilai int i menjadi tipe data short dan mengembalikannya.
    }

    public static void main(String[] args) {
        double d = 10.25; // Mendefinisikan variabel double d dengan nilai 10.25.
        float f = (float) d; // Mengonversi nilai double d menjadi tipe data float f.

        // Memanggil methodOne dengan argumen yang telah dikonversi dan mengonversi kembali hasilnya menjadi tipe data byte.
        byte b = (byte) methodOne((long) f);

        System.out.println(b); // Mencetak nilai tipe data byte b ke layar.
    }
}