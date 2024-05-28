package LinkedList;

import java.util.LinkedList;

public class LinkedListToStackAdapter {
    public static void main(String[] args) {

    }
    static class myStack{
        LinkedList<Integer> list;
        myStack(){
            list=new LinkedList<>();
        }
        int size(){
            return list.size();
        }
        void push( int val){
            list.addFirst(val);
        }
        void pop(){
            if(list.isEmpty()) {
                System.out.println("this is empty");
            }
        }
        int top(){
            return list.getFirst();
        }

    }
}
