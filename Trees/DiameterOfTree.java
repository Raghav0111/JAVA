public class DiameterOfTree {
    
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
        int height(Node root){
            if(root == null){
                return 0;
            }
            return Math.max(height(root.left), height(root.right))+1;
        }

        // Linear Approach Time Complexity O(N^2)
        int diameter(Node root){

            if(root == null){
                return 0;
            }
            
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left)+height(root.right)+1;

            int dm = Math.max(diam3, Math.max(diam2, diam1));

            return dm;

        }

        // Optimised Approach with Time Complexity of O(N)

        class MyTree{
            int ht;
            int diam;

            MyTree(int ht, int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }

        MyTree DiameterOptimised(Node root){
            if (root ==null){
                return new MyTree(0, 0);
            }
            MyTree left = DiameterOptimised(root.left);
            MyTree right = DiameterOptimised(root.right);

            int MyHeight = Math.max(left.ht,right.ht)+1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht+ right.ht +1;

            int MyDiameter = Math.max(Math.max(diam1, diam2), diam3);

            MyTree Myinfo = new MyTree(MyHeight, MyDiameter);

            return Myinfo;

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

            int res = tree.diameter(tree.root);

            System.out.println("The Diamter of Binary Tree is: "+res);
            System.out.println("The OptimisedDiamterCalculation of Binary Tree is: "+res);
        }
    }
    
}
