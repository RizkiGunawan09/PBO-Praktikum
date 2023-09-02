public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; // Mendefinisikan konstanta CM_PER_INCH dengan nilai 2.54
        double paperWidth = 8.5; // Menginisialisasi lebar kertas dalam satuan inci
        double paperHeight = 11; // Menginisialisasi tinggi kertas dalam satuan inci
        // Menghitung dan mencetak ukuran kertas dalam sentimeter dengan mengalikan dengan konstanta
        System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}