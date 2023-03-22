public class ReverseLL {
    /* Real List: 1->2->3->4->->null
     * Reversed list: nulll<-1<-2<-3<-4
     * Catch: No extra Memory to be used that means Space Complexity O(1)
     */

    // Iterative Way
    Node head;
    int size;

    ReverseLL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node n = new Node(data);
        if (head == null){
            head = n;
            return;
        }

        n.next = head;
        head = n;

    }

    public void addLast(int data){
        Node n = new Node(data);

        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;

    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node SecondLast = head;
        Node Last = head.next;

        while(Last.next!=null){
            SecondLast = SecondLast.next;
            Last = Last.next;
        }
        SecondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }System.out.println("null");
    }

    public void reverseIterate(){
        if(head == null){
            return;
        }

        if(head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;

    }

    // Recursive way

    public Node reverseRecursive(Node head){
        if(head==null || head.next == null){
            return head;
        }

        Node newhead = reverseRecursive(head.next);
        head.next.next= head;
        head.next = null;

        return newhead;
    }


    public static void main(String args[]){
        ReverseLL List = new ReverseLL();
        List.addFirst(1);
        List.addLast(2);
        List.addLast(3);
        List.addLast(4);
        List.addLast(5);
        List.addLast(6);
        List.printList();

        // List.reverseIterate();
        // List.printList();

        List.head = List.reverseRecursive(List.head);
        List.printList();
    }
    

}
