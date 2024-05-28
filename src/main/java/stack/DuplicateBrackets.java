package stack;

import java.util.Stack;

public class DuplicateBrackets {
    //given a string exp representing an expression.Print true false if there are extra brackets
    //((a+b)+(c+d)->false
    //(a+b)+(a+b)->true
    public static void main(String[] args) {
     String input="((a+b)+(c)+d))";
     char[] inputChar=input.toCharArray();
     Stack<Character> expressionTracker=new Stack<>();
     for(int i=0;i<=inputChar.length-1;i++){
         if(inputChar[i]=='('){
             expressionTracker.push(inputChar[i]);
         }
         if(inputChar[i]==')' && !expressionTracker.isEmpty())
             expressionTracker.pop();

     }
        System.out.println(expressionTracker.isEmpty());
    }
}
