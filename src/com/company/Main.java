package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfOrderedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number you want to find.");
        int key = scanner.nextInt();
        int resultBinarySearch = BinarySearch.findingANumberFromAnArray(arrayOfOrderedNumbers, key);
        if (resultBinarySearch != -1) {
            System.out.println(resultBinarySearch);
        } else {
            System.out.println("The entered number is not in the array.");
        }
    }
}
