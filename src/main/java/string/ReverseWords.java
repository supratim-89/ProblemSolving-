package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String input ="Welcome to Java World";
        String[] inputList= input.split(" ");

        for(int i=inputList.length-1;i>=0;i--){
            System.out.print(inputList[i]+" ");

        }
    }
}
