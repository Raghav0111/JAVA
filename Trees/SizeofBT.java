import java.util.*;

public class SizeofBT {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = this.right =  null;
        }
    }

    static class BinaryTree{
        Node root;
        BinaryTree(){root = null;}

        int size(Node root){
            if(root == null){
                return 0;
            }

            return size(root.left)+size(root.right)+1;
        }

        // Returning Max and Min elements in a binary tree

        int Mximum(Node root){
            if(root == null){
                return Integer.MIN_VALUE;
            }
    
            return Math.max(root.data, Math.max(Mximum(root.left), Mximum(root.right)));
        }

        int Minimum(Node root){
            if(root == null){
                return Integer.MAX_VALUE;
            }
            return Math.min(root.data,Math.min(Minimum(root.left), Minimum(root.right)));
        }
        
    }

    

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(6);

        int elements = tree.size(tree.root);
        //System.out.println(elements);
        
        int Maxele = tree.Mximum(tree.root);
        System.out.println("The greatest element in this tree is: " + Maxele);

        System.out.println("The smallest element in this tree is: " + tree.Minimum(tree.root));
    }


}
