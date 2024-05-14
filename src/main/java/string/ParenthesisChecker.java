package string;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String input="[{}]";
        char[] inputCharArray=input.toCharArray();

        Stack<Character> parenthesisTracker=new Stack<>();
        for(int i=0;i<=input.length()-1;i++){
             char ch=input.charAt(i);
             if(parenthesisTracker.empty())
                 parenthesisTracker.push(ch);
             else if(ch == '(' || ch == '{' || ch == '[')
                 parenthesisTracker.push(ch);
             else if(ch == '}' && parenthesisTracker.peek()=='{'){
                 parenthesisTracker.pop();
             }
             else if(ch == ']' && parenthesisTracker.peek()=='['){
                 parenthesisTracker.pop();
             }

        }
        if(parenthesisTracker.empty())
            System.out.println("Given String is well formed");
        else
            System.out.println("Given String is  not well formed");
    }
}
