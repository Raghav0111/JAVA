import java.util.*;

public class LeftViewRightView {
    static class Node {
        int data;
        Node left, right;
        public Node(int item)
        {
            this.data = item;
            this.left = this.right = null;
        }
    }
    static class BinaryTree {
        // Root of the Binary Tree
        Node root;
        static int idx = -1;
        Node buildTree(int data[]){
            idx++;
            if(data[idx] == -1){
                return null;
            }
            Node newNode = new Node(data[idx]);
            newNode.left = buildTree(data);
            newNode.right = buildTree(data);

            return newNode;
        }

        

        int height(Node root){
            if(root == null){
                return 0;
            }
            return Math.max(height(root.left), height(root.right))+1;
        }

        List<Integer> printRightView(Node root){
            List<Integer> result = new ArrayList<>();

            RightView(root,result,0);
            return result;
        }

        void RightView(Node root, List<Integer> result, int level){
            level = 0;
            if(root==null){
                return;
            }
            ArrayList<Node> ds = new ArrayList<>();
            if (level == ds.size()){
                ds.add(root);
            }
            RightView(root.right,result, level+1);
            RightView(root.left,result, level+1);
        }



        
    
        /* Driver program to test above functions */
        public static void main(String args[])
        {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            
            
        }
    }
}
