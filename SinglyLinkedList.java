import java.util.*;

public class SinglyLinkedList {
    // Node head;
    // private int size;

    // SinglyLinkedList(){
    //     this.size = 0;
    // }

    
    // class Node{
    //     int data;
    //     Node next;

    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //         size++;
    //     }
    // }

    
    
    // public void addFirst(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }
    // //Add last

    // public void addLast(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = newNode;
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp.next!=null){
    //         temp = temp.next;
    //     }
    //     temp.next = newNode;

    // }
    // // Print

    // public void printList(){
    //     if(head == null){
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.data+"->");
    //         temp = temp.next;
    //     }System.out.println("null");
    // }

    // // Delete First
    // public void deleteFirst(){
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--;
    //     head = head.next;
    // }


    //     // Delete Last
    // public void deleteLast(){
    //     if(head == null){
    //         System.out.println("The list is empty");
    //         return;
    //     }
    //     size--;
    //     if(head.next == null){
    //         head = null;
    //         return;
    //     }
    //     Node temp = head;
    //     Node todelete = head.next;

    //     while(todelete.next!=null){
    //         todelete = todelete.next;
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    // }

    // public int getSize(){
    //     return size;
    // }



    public static void main(String args[]){
        // SinglyLinkedList list  = new SinglyLinkedList();
        // list.addFirst(1);
        // list.addFirst(2);
        // list.printList();

        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // list.addLast(6);

        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // int realsize = list.getSize();
        // System.out.println(realsize);

        // Now using Collection Framework
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(1);
        list.addFirst(2);
        System.out.println(list);

        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list);

        // Size pta krna

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }System.out.println("null");

        //Delete Operations

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }

}

