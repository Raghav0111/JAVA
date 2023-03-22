public class NthNodeFromLast {

    Node head;
    int size;

    NthNodeFromLast(){
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

    public Node Nthnode(int n){
        if(head==null|| head.next == null){
            return null;
        }
        
        Node temp = head;

        // One way to get size

        int Size = 0;
        while(temp!=null){
            temp = temp.next;
            Size++; 
        }

        if (Size == n){
            return head.next;
        }
        int dest = Size-n+1;
        Node temp1 = head;
        for(int i=1;i<dest-1;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return head;

    }
    public static void main(String args[]){

        NthNodeFromLast n = new NthNodeFromLast();

        n.addFirst(1);
        n.addLast(2);
        n.addLast(3);
        n.addLast(4);
        n.addLast(5);
        n.addLast(6);
        n.printList();

        n.head=n.Nthnode(2);
        n.printList();



    }
}
