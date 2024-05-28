package LinkedList;

public class LinkedListTesting2 {
    public static void main(String[] args) {
        MyLinkedList myList=new MyLinkedList();
        myList.addLast(5);myList.addLast(6);myList.addLast(9);
        myList.addLast(10); myList.addLast(11);
     //   myList.display();
      //  myList.removeFirst();
      //  System.out.println();
     //   myList.display();
      //  myList.getAt(3);
     //   myList.addFirst(18);
      //  myList.insertAt(3,25);
        System.out.println();
        myList.display();
      //  myList.reverseList();
        myList.removeAt(5);
        System.out.println();
        myList.display();
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
                Node temp=new Node();
                temp.data=data;
                head=tail=temp;
                size++;
            }
            else{
                Node temp=new Node();
                temp.data=data;
                temp.next=head;
                head=temp;
                size++;
            }
        }
        public void insertAt(int position,int data){
            if(size<position){
                System.out.println("Invalid input");
            }
            else if(position==0){
                Node temp=new Node();
                temp.data=data;
                head=tail=temp;
                size++;
            }
            else {
                int i = 0;
                Node currentPosition = head;
                while (i <= position - 2) {
                    currentPosition = currentPosition.next;
                    i++;
                }
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = currentPosition.next;
                currentPosition.next = newNode;
                size++;
            }

        }

        public void removeAt(int position){
            if(size==0){
                System.out.println("List is empty");
            }
            if(size==1){
                head=tail=null;
                size--;
            }
            else {
                int i = 0;
                Node currentPosition = head;
                Node prev = null;
                while (i <= position - 2) {
                    prev = currentPosition;
                    currentPosition = currentPosition.next;
                    i++;
                }
                prev.next = currentPosition.next;
                size--;
            }


        }

        public  void reverseList(){
            //using pointer inversion
            Node prev=null;
            Node current=head;
            while(current!=null){
                Node temppointer=current.next;
                current.next=prev;
                prev=current;
                current=temppointer;

            }
            head=prev;

        }
    }
}


