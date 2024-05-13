package org.supratim.arrays;

public class PairSum {
    /*Given an array A[] of n numbers and another number x,
         the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
        Input: arr[] = {0, -1, 2, -3, 1}, x= -2
        Output: Yes
        Explanation: If we calculate the sum of the output,1 + (-3) = -2

        Input: arr[] = {1, -2, 1, 0, 5}, x = 0
        Output: No*/
    public static void main(String[] args) {
        int[] input={1, -2, 1, 0, 5};
        int x=-2;
        System.out.println("the result is ::"+checkSum(input,x));

    }
    public  static boolean checkSum(int[] input ,int sumVal){
        for(int i=0;i<=input.length-2;i++){
            for(int j=i+1;j<=input.length-1;j++){
                int result=input[i]+input[j];
                System.out.println(input[i]+" "+input[j]+"="+result);
                if(result==sumVal)
                 return true;
            }
        }
        return false;
    }


}