package com.company;

/*
 * @param setOfOrderedNumbers - filled array
 * @param key - the number to find in the array
 * @return - found number in array ;
 */
public class BinarySearch {
    public static int findingANumberFromAnArray(int[] arrayOfOrderedNumbers, int key) {
        int low = 0;
        int high = arrayOfOrderedNumbers.length;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < arrayOfOrderedNumbers[middle]) {
                high = middle - 1;
            } else {
                if (key > arrayOfOrderedNumbers[middle]) {
                    low = middle + 1;
                } else {
                    return middle;
                }
            }
        }
        return -1;
    }
}
