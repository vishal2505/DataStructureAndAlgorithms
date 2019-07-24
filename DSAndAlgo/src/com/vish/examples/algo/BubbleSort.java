package com.vish.examples.algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int array[] = {12,29,43,45,56,34,21,65,34,45};

        System.out.println("Before Sorting : " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j=0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting : " + Arrays.toString(array));
    }
}
