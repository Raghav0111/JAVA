// Floyd's Algorith of Detecting Loop, Also known as Rabbit Tortoise Algorithm

public class CycleDetection {
    Node head;
    int size;

    CycleDetection(){
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

    public boolean isCycle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
                // removing the linked list
            }

        }

        return false;
    }


    public static void main(String args[]){
        CycleDetection List = new CycleDetection();
        List.addFirst(1);
        List.addLast(2);
        List.addLast(3);
        List.addLast(4);
        List.addLast(5);
        List.addLast(6);
        List.printList();

        System.out.println(List.isCycle(List.head));
    }
}
