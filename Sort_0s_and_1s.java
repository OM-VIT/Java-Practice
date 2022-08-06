package com.company;

import java.util.ArrayList;

public class Sort_0s_and_1s {

    static ArrayList<Integer> Zero_one_sorter(int[] arr) {
        //zero counter
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        //append arraylist for zeros
        ArrayList<Integer> zerocount = new ArrayList<Integer>();
        for (int j = 0; j < count; j++) {

            zerocount.add(0);

        }
        int no_of_ones = arr.length - count;

        for (int k = count; k < arr.length; k++) {
            zerocount.add(1);
        }

        return zerocount;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,0,1};
        Zero_one_sorter(arr);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}