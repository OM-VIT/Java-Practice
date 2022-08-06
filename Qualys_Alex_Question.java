package com.company;
//Done and Dusted baebyeeee

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qualys_Alex_Question {


    static int calculateAmount(List<Integer> Prices){
        int sum=0;
        int discsum=0;
        int first = Prices.get(0);
        for(int i=1;i<Prices.size();i++){
            int discount = Prices.get(i)-Prices.get(i-1);//
            if(discount<0){
                discount=0;
            }

            discsum=discsum+discount;
            //System.out.println(discount);

            sum=first+ discsum;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(4,1,2,3,4));
        System.out.println(calculateAmount(List));
        //calculateAmount(List);

    }
}
