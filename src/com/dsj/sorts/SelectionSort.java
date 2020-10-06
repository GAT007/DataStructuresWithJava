package com.dsj.sorts;

public class SelectionSort {

    public static void main(String [] args) {
        int[] intArray = {10, 15, -2, 6, 18, 65, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int current = 1; current < lastUnsortedIndex; current++) {
                if (intArray[current] > intArray[largest]) {
                    largest = current;
                }
            }
            swap(intArray, lastUnsortedIndex, largest);
        }

        for (int printer = 0; printer < intArray.length - 1; printer++)
        {
            System.out.println(intArray[printer] + " ");
        }
    }

    public static void swap(int [] intArray, int left, int right)
    {
        int temp = intArray[left];
        intArray[left] = intArray[right];
        intArray[right] = temp;
    }
}
