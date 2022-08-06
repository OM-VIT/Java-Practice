package com.company;
//done and dusted
public class Array_Similarity {
    static int findSimilarity(int [] arr1,int [] arr2){
        int count=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }




    public static void main(String[] args) {
        int [] one={1,2,3,5,3,6,8};
        int [] two={1,9,9,9,9,6,1};
        //findSimilarity(one,two);

        System.out.println(findSimilarity(one,two));
    }
}
