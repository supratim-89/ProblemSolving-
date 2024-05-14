package LinkedList;

import java.sql.SQLOutput;

public class LinkedListTesting {

  class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
          next=null;
      }
  }
  Node  head;
  Node tail;

  public void addNode(int data){
      Node newNode=new Node(data);
      if(head== null){
          head=newNode;
          tail=newNode;
      }
      else{
          tail.next=newNode;
          tail=newNode;
      }
  }

  public void printLinkedList() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data + "->");
          temp = temp.next;
      }
  }

  public  void findMiddleNode(){
      Node slowPointer=head;
      Node fastPointer=head;
      while (fastPointer !=null && fastPointer.next!=null){
          fastPointer=(fastPointer.next).next;
          slowPointer=slowPointer.next;
      }
      System.out.println("The midway pointer"+slowPointer.data);
  }

    public  void findLoopInLinkedList(){
        Node slowPointer=head;
        Node fastPointer=head;
        while (slowPointer!=null && fastPointer !=null && fastPointer.next!=null){
            fastPointer=(fastPointer.next).next;
            slowPointer=slowPointer.next;
            if(slowPointer==fastPointer){
                System.out.println("There is a loop");
                break;
            }
        }

    }



    public static void main(String[] args) {
        LinkedListTesting newLinkedList=new LinkedListTesting();
        newLinkedList.addNode(1);
        newLinkedList.addNode(2);
        newLinkedList.addNode(3);
        newLinkedList.addNode(4);
        newLinkedList.addNode(5);
        newLinkedList.addNode(6);
        newLinkedList.printLinkedList();
        newLinkedList.findMiddleNode();
        //creating infinite loop
      //  newLinkedList.head.next.next=newLinkedList.head.next;

    }

}
