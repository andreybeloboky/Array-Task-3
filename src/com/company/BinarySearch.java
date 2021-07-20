package com.company;

/*
 * @param setOfOrderedNumbers - filled array
 * @param key - the number to find in the array
 * @return - found number in array ;
 */
public class BinarySearch {
    public static int findingANumberFromAnArray(int[] setOfOrderedNumbers, int key) {
        int low = 0;
        int high = setOfOrderedNumbers.length;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < setOfOrderedNumbers[middle]) {
                high = middle - 1;
            } else if (key > setOfOrderedNumbers[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
