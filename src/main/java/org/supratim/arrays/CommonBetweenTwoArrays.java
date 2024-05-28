package org.supratim.arrays;

import java.util.Arrays;

public class CommonBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1={3,4,5,6,8};
        int[] arr2={6,8,9,4};
        int[] result=new int[5];
        for(int i=0;i<=arr1.length-1;i++){
           for(int j=0;j<=arr2.length-1;j++){
               if(arr1[i]==arr2[j]){
                   result[i]=arr1[i];
                   break;
               }
           }
        }
        System.out.println(Arrays.toString(result));

    }
}
