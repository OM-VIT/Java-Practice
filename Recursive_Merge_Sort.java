package com.company;

public class Recursive_Merge_Sort {
    static void mergeSort(int arr[],int size){

        //base case
        if(size==0||size==1){
            return;
        }
        for (int i=0;i<size;i++){
            int smallest=arr[i];
            if(arr[i]<smallest){
                int temp=arr[i];
                arr[i]=smallest;
                smallest=temp;
                smallest=arr[i];
            }
        }
        mergeSort(arr,size-1);
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,0,2,0,1,2,0,1};
        int size=arr.length;
        mergeSort(arr,size);

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
