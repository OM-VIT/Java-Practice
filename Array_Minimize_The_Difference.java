package com.company;
//done and dused baby
public class Array_Minimize_The_Difference {

    static int maximum(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int minimum(int[]arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }




    static int minimum_Difference(int [] arr, int k){
        //finding min and max
        int n=arr.length;
        int max=maximum(arr);
        int height= max-k;

        for(int j=0;j<n;j++){
            if(arr[j]+k>height){
                arr[j]=arr[j]-k;
            }
            else{
                arr[j]=arr[j]+k;
            }
        }
        int newmax=maximum(arr);
        int newmin=minimum(arr);

        return newmax-newmin;
    }


    public static void main(String[] args) {

     int[]array={1,2,3,4,5};
     //System.out.println(minimum(array));


       int ans= minimum_Difference(array,2);
        System.out.println(ans);

        }


    }
