package org.supratim.arrays;
 /* Given an array arr[] of n integers, construct a Product Array prod[] (of the same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i].

    Note: Solve it without the division operator in O(n) time.

    Example :

    Input: arr[]  = {10, 3, 5, 6, 2}
    Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array
    elements except 10 is 180
            10 * 5 * 6 * 2 product of other array
    elements except 3 is 600
            10 * 3 * 6 * 2 product of other array
    elements except 5 is 360
            10 * 3 * 5 * 2 product of other array
    elements except 6 is 300
            10 * 3 * 6 * 5 product of other array
    elements except 2 is 900*/

//WIP
import java.util.Arrays;

public class ProductArrayExceptItself {

    public static void main(String[] args) {
    int[] inputArray={10, 3, 5, 6, 2};
        System.out.println("The product array is ::"+Arrays.toString(ProductArrayExceptItself.productArray(inputArray)));
    }

    public static int[] productArray(int[] input){
        System.out.println("inside productArray"+Arrays.toString(input));
        int[] resultarr=new int[input.length];

    for(int i=0;i<=input.length-1;i++){
        resultarr[i]=ProductArrayExceptItself.productFromStartToIndex(input,i) * ProductArrayExceptItself.productFromIndexToEnd(input,i);
    }
    return resultarr;
    }
    public static int productFromStartToIndex(int[] input,int currentIndex){
        int prodresultStartToIndex=input[0];
        for(int j=1;j<=currentIndex-1;j++){
            prodresultStartToIndex*=input[j];
        }
        System.out.println("productFromStartToIndex result "+prodresultStartToIndex);
        return prodresultStartToIndex;
    }

    public static int productFromIndexToEnd(int[] input,int currentIndex){
        int prodresultIndexToEnd=input[currentIndex+1];
        for(int j=currentIndex+2;j<=input.length-1;j++){
            prodresultIndexToEnd*=input[j];
        }
        System.out.println("productFromIndexToEnd result "+prodresultIndexToEnd);
        return prodresultIndexToEnd;
    }

}
