import java.util.*;

class BFS{
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

        void printLevelOrderBetter(){
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            // Adding next line
            q.add(null);
            while(!q.isEmpty()){
                Node curr = q.poll();
                if(curr == null){
                    if(!q.isEmpty()){
                        q.add(null);
                        System.out.println();
                    }
                }
                else{
                    System.out.print(curr.data+ " ");

                    if(curr.left!=null){
                    q.add(curr.left);
                    }

                    if(curr.right!=null){
                    q.add(curr.right);
                    }
                
                }
                
            }
        }
    
        void printlevelOrderNaive(){
            int h = height(root);
            for(int i = 1;i<=h;i++){
                printLevelOrderI(root, i);;
            }

        }

        int height(Node root){
            if(root == null){
                return 0;
            }
            return Math.max(height(root.left), height(root.right))+1;
        }



        void printLevelOrderI(Node root, int level){
            if(root == null){
                return;
            }
            if(level == 1){
                System.out.print(root.data+ " ");
            }

            printLevelOrderI(root.left, level-1);
            printLevelOrderI(root.right, level-1);
        }

        void printInOrder(Node root){
            if(root == null){
                return;
            }
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printInOrder(root.right);
        }

        void printInorder(){
            printInOrder(root);
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

            
            //tree.printlevelOrderNaive();
            tree.printLevelOrderBetter();
        }
    }
}