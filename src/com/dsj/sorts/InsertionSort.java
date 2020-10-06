package com.dsj.sorts;

public class InsertionSort {

    public static void main(String [] args){

        int [] intArray = {28, 55, 79, -2, 4, 12};
        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--)
            {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        for(int printer = 0;printer<intArray.length;printer++)
        {
            System.out.print(intArray[printer] + " ");
        }
    }
}
