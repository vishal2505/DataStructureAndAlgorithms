package com.vish.examples.algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int array[] = {12,29,43,45,56,35,21,65,34,45};

        System.out.println("Before Sorting : " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j=i+1; j < array.length; j++){
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("After Sorting : " + Arrays.toString(array));
    }
}

