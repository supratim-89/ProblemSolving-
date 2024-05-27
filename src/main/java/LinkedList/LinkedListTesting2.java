package LinkedList;

public class LinkedListTesting2 {
    public static void main(String[] args) {
        MyLinkedList myList=new MyLinkedList();
        myList.addLast(5);myList.addLast(6);myList.addLast(9);
        myList.display();
      //  myList.removeFirst();
        System.out.println();
        myList.display();
        myList.getAt(3);
    }

    public static class Node{
        int data;
        Node next;

    }

    public static class MyLinkedList{
        Node head;
        Node tail;

        int size;

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

        public void removeFirst(){
            if(size==0){
                System.out.println("The list is empty");
            }
            else if(size==1){
                head=tail=null;
                size--;
            }
            else{
                head=head.next;
                size--;
            }
        }
        public void getAt(int index){
            if(size==0 || size<index){
                System.out.println("Invalid input");
            }
            else{
                int i=0;
                Node temp=head;
                while( i<=index-2){
                    temp=temp.next;
                    i++;
                }
                System.out.println("The value at "+index+"is "+temp.data);
            }

        }
        public void addFirst(int data){
            if(size==0){

            }
        }
    }
}


