package com.perscholas.PAarray;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args)
    {
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println("minVal = " + minVal);
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println("Max Element = " + maxVal);
    }
}





