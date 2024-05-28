package LinkedList;

public class LinkedListTesting3 {
    public static void main(String[] args) {
        MyLinkedList3 myList=new MyLinkedList3();
        myList.addLast(5);myList.addLast(6);myList.addLast(9);
        myList.addLast(10); myList.addLast(11);
        myList.display();
        myList.findKthFromEnd(5);
        System.out.println("------");
        myList.middleElement();
    }

    public static class Node{
        int data;
        Node next;

    }

    public static class MyLinkedList3{
        Node head;
        Node tail;

        int size;

        void findKthFromEnd(int k){
            Node slow=head;
            Node fast=head;
            int i=0;
            while(i<k){
                fast=fast.next;
                i++;
            }
            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }

            System.out.println("The kth element from back is "+slow.data); ;

        }

        void middleElement(){
            Node slow=head;
            Node fast=head;
            while(fast.next     !=null){
                fast=fast.next.next;
                slow=slow.next;
            }

            System.out.println("The middle element "+slow.data); ;

        }

        void addLast(int data){
            if(size==0){
                Node temp=new Node();
                temp.data=data;
                temp.next=null;
                head=tail=temp;
                size++;
            }
            else{
                Node temp=new Node();
                temp.data=data;
                temp.next=null;
                tail.next=temp;
                tail=temp;
                size++;
            }

        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
        }
    }


}
