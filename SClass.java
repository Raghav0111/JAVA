

// static class Stack {
//     // static class Node{
//     //     int data;
//     //     Node next;
//     //     public Node(int data){
//     //         this.data = data;
//     //         next = null;
//     //     }
//     // } 
//     // static class StackClass{
//     //     public static Node head;
//     //     public static boolean isEmpty(){
//     //         return head == null;
//     //     }
//     //     public static void push(int data){
//     //         Node newNode = new Node(data);
//     //         if (isEmpty()){
//     //             head = newNode;
//     //             return;
//     //         }
//     //         newNode.next = head;
//     //         head = newNode;
//     //     }
//     //     public static int peek(){
//     //         if(isEmpty()){
//     //             return -1;
//     //         }
//     //         return head.data;
//     //     }

//     //     public static int pop(){
//     //         if(isEmpty()){
//     //             return -1;
//     //         }
//     //         int top = head.data;
//     //         head = head.next;
//     //         return top;
//     //     }
    
//     //}
//     static ArrayList<Integer> list = new ArrayList<>();
//     public static boolean isEmpty(){
//         return list.size()==0;
//     }

//     // Push Data
//     public static void push(int data){
//         list.add(data);
//     }

//     //Pop Data
//     public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top = list.get(list.size()-1);
//         list.remove(list.size()-1);
//         return top;
//     }

//     // Peek Data
//     public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return list.get(list.size()-1);
//     }

    

//     public static void main(String args[]){
//         StackClass s = new StackClass();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// Stack Implementation
import java.util.*;
public class SClass{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        Reverse(s);
        pushAtBottom(top, s);
    }

    public static void PrintStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek()) ;           
            s.pop();
        }
    }
    public static void main(String args[]){
        Stack<Integer> s  = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        // Push At bottom of stack;
        //pushAtBottom(4, s);
        // PrintStack(s);
        
        System.out.println("---------------------------");
        // Reverse a stack
        Reverse(s);

        PrintStack(s);
    }
}