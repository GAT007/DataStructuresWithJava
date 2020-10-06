package com.dsj.section1;

public class Array {
    public static void main(String [] args)
    {
        int [] intArray = new int[7];
        String [] array = {""};
        intArray[0] = 20;
        intArray[1] = 231;
        intArray[3] = 420;
        intArray[4] = 69;
        intArray[5] = 5318008;
        intArray[6] = 314;

        for(int i=0;i<intArray.length;i++)
        {
            System.out.println("Array element at position " + i + " : " + intArray[i]);
        }

    }
}
