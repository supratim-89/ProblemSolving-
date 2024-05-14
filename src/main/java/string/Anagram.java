package string;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String input1="listen";
        String input2="silent";
        boolean isAnagram=true;
        int[] countArray=new int[256];
        char[] input1InCharArray=input1.toCharArray();
        char[] input2InCharArray=input2.toCharArray();
        for(int i=0;i<=input1InCharArray.length-1;i++){
            countArray[input1InCharArray[i]]+=1;
        }
        for(int j=0;j<=input2InCharArray.length-1;j++){
            countArray[input2InCharArray[j]]-=1;
        }
        for(int k=0;k<=countArray.length-1;k++){
            if(countArray[k]!=0) {
                isAnagram=false;
                break;
            }
        }

        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
