// There are many possible ways one among them is to reverse the linkedlist and compare the two but one common fault in all of these approaches is that Extra space will be used which can cause an issue while we are in Competive Programming or while solving this problem on an online medium.

// So we need a solution where wedo not need to use extra memory.

// So the approach is to divide the linkedlist into half and reverse either first half or secondhalf
/*
 * Find middle of linkedlist
 * reverse the second half/ first half
 * compare the two halves
 */

public class LLPalindrome {
    Node head;
    int size;

    LLPalindrome(){
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

    public Node reverseRecursive(Node head){
        if(head == null|| head.next == null){
            return head;
        }
        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return newhead;
    }

    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node middle = findMiddle(head);// First half ka end
        Node SecondhalfStart = reverseRecursive(middle.next);

        Node firsthalfstart = head;
        while(SecondhalfStart != null){
            if(firsthalfstart.data != SecondhalfStart.data){
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            SecondhalfStart = SecondhalfStart.next;

        }
        return true;

    }
    public static void main(String args[]){

        LLPalindrome n = new LLPalindrome();

        n.addFirst(1);
        n.addLast(2);
        n.addLast(2);
        n.addLast(1);
        n.printList();
        
        boolean res = n.isPalindrome(n.head);
        System.out.println(res);




    }
}

