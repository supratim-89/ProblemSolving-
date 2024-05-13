package org.supratim.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MaximumProductSubarray {
/*    Given an array that contains both positive and negative integers,
      the task is to find the product of the maximum product subarray.

            Examples:

    Input: arr[] = {6, -3, -10, 0, 2}
    Output:  180
    Explanation: The subarray is {6, -3, -10}

    Input: arr[] = {-1, -3, -10, 0, 60}
    Output:   60
    Explanation: The subarray is {60}*/
    public static void main(String[] args) {
        int[] inputArray={1, -3, -10, 0, 60};
        int maxVal=1;
        for(int i=0;i<=inputArray.length-1;i++){
           for(int j=i;j<=inputArray.length-1;j++){
               int productSubArray=1;
              for(int k=i;k<=j;k++)
              {
                  productSubArray*=inputArray[k];
                  System.out.println(inputArray[k]);
              }
               maxVal=productSubArray>maxVal?maxVal=productSubArray:maxVal;
               System.out.println("Product subArray value"+productSubArray);

               System.out.println();
           }

        }
        System.out.println("The max value is :"+maxVal);
    }
}
