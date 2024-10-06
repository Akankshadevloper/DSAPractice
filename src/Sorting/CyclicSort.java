package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void sort(int[] arr){
       int i =0;
       while(i < arr.length){
           int correctIndex = arr[i]-1;
           if (arr[i] != arr[correctIndex]){
               swap(arr, i, correctIndex);
           }else{
               i++;
           }
       }
    }
}
