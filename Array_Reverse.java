package com.company;

public class Array_Reverse {
    public static void main(String[] args) {
        //code
        int arr1[]={1,2,3,4};
        reverse(arr1);

    }



    static void reverse(int [] arr) {
        for (int i = 0; i < arr.length; i++) {

                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;

        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
}