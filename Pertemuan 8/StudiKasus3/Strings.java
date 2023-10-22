//********************************************************************
//  Strings.java
//
//  Demonstrates selectionSort on an array of integers.
//********************************************************************

import java.util.Scanner;

public class Strings {
    // --------------------------------------------
    //  Reads in an array of String, sorts them,
    //  then prints them in sorted order.
    // --------------------------------------------
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        scan.nextLine(); // Membersihkan karakter baris baru

        System.out.println("\nEnter the Strings...");
        for(int i = 0; i < size; i++)
            stringList[i] = scan.nextLine();

        Sorting.selectionSort(stringList);

        System.out.println("\nYour Strings in sorted order...");
        for(int i = 0; i < size; i++)
            System.out.println(stringList[i] + " ");
        System.out.println();
    }
}
