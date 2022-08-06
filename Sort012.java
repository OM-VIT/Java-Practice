package com.company;

public class Sort012 {
    public static void main(String[] args) {
        int [] arr={0,2,2,0,1,0,2,1,0};
        sort012(arr,arr.length);

        //printing array
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    static void sort012(int [] arr, int size){
        if(size==0||size==1){
            return;
        }
        size=arr.length;
        for(int i=0;i<size;i++){
            int smallest=arr[0];
            if(arr[i]>smallest){
                int temp = smallest;
                smallest = arr[i];
                arr[i]   = temp;
            }
        }
        sort012(arr, size-1);
    }
}
