package com.dsj.sorts;

public class BubbleSort {

    public static void main(String [] args)
    {
        int [] intArray = {10, 5, -1, 12, 15, 6,-22};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            for(int frontCounter = 0; frontCounter<lastUnsortedIndex;frontCounter++)
            {
                if(intArray[frontCounter]>intArray[frontCounter+1])
                {
                    swap(intArray,frontCounter,frontCounter+1);
                }
            }
        }

        for(int printCounter = 0;printCounter<intArray.length;printCounter++)
        {
            System.out.print(intArray[printCounter] + " , ");
        }

    }

    public static void swap(int [] intArray, int left, int right)
    {
        if(left==right)
        {
            return;
        }
        int temp = intArray[left];
        intArray[left] = intArray[right];
        intArray[right] = temp;
    }
}
