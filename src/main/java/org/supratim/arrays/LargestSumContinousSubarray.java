package org.supratim.arrays;
/*Kadane’s Algorithm
Given an array arr[] of size N.
The task is to find the sum of the contiguous subarray within a arr[]
with the largest sum.

Example:

Input: arr = {-2,-3,4,-1,-2,1,5,-3}
Output: 7
Explanation: The subarray {4,-1, -2, 1, 5} has the largest sum 7.

Input: arr = {2}
Output: 2
Explanation: The subarray {2} has the largest sum 1.

Input: arr = {5,4,1,7,8}
Output: 23
Explanation: The subarray {5,4,1,7,8} has the largest sum 25.*/
public class LargestSumContinousSubarray {
    public static void main(String[] args) {
        int[] inputArray={-2,-3,4,-1,-2,1,5,-3};
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<=inputArray.length-1;i++){
            max_ending_here=max_ending_here+inputArray[i];

            if(max_ending_here<0)
                max_ending_here=0;

            if(max_ending_here>max_so_far)
                max_so_far=max_ending_here;

        }
        System.out.println("The result is ::"+max_so_far);


}}
