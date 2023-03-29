import java.util.*;

public class SumOfNodesAtKthLevel {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        Node root;
        BinaryTree(){
            root = null;
        }

        void SumatK(Node root, int level){
            int ans= 0;
            int counter = 1;
            if(level == counter){
                System.out.println(ans+=root.data);
                return;
            }
            SumatK(root.left, level);
            SumatK(root.right, level);
            counter++;
        }
    

        public static void main(String args[]){

            BinaryTree tree = new BinaryTree();

            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            tree.root.right.left = new Node(6);
            tree.root.right.right = new Node(7);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the level for Sum of Nodes in a tree: ");
            int k = sc.nextInt();

            tree.SumatK(tree.root,k);



            
        }
    }
}
