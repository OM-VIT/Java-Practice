package com.company;

public class Array_Rotate {
    static int [] arrayRotate(int [] arr, int k){
        int [] rotatedArray={};
        for(int i=k;i<arr.length;i++){
            for(int j=0;j<arr.length-k-1;j++){
                rotatedArray[j]=arr[i];
            }

        }
        for(int m=0;m<k;m++){
            for(int n=k; n<arr.length;n++){
                rotatedArray[n]=arr[m];
            }
        }
        return rotatedArray;
    }
    public static void main(String[] args) {
    int [] array={1,2,3,4,5,6,7,8,9};
    arrayRotate(array,1);
    for(int x=0;x<array.length-1;x++){
        System.out.println(arrayRotate(array,2)[x]);
    }
    }
}
