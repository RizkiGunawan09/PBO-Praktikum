// ******************************************************
//  WeeklySales.java
//
//  Sorts the sales staff in descending order by sales.
// ******************************************************

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah sales: ");
        int numSalespeople = scan.nextInt();
        scan.nextLine(); // Menghapus karakter newline

        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        System.out.println("Masukkan nama depan, nama belakang, dan total penjualan\n" +
                "Contoh: John Doe 1000\n");
        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Sales ke-" + (i+1) + ": ");
            String firstName = scan.next();
            String lastName = scan.next();
            int totalSales = scan.nextInt();
            scan.nextLine(); // Menghapus karakter newline

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}

