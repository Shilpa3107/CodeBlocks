import java.util.Scanner;
// class Node{
//         int val;
//         Node left;
//         Node right;
//     }
public class Tree{
    public static class Node{
        int val;
        Node left;
        Node right;
    }
    public static void main(String args[]){
        Node root = Create();
        display(root);
    }
    public static Node Create(){
        Scanner sc = new Scanner(System.in);
        Node n = new Node();
        n.val = sc.nextInt();

        System.out.println("Do you want to have the left child of this node?");
        int l = sc.nextInt(); // 1 == yes otherwise no
        if(l == 1){
          n.left = Create();
        }

        System.out.println("Do you want to have the right child of this node?");
        int r = sc.nextInt(); // 1 == yes otherwise no
        if(r == 1){
          n.right = Create();
        }
        return n;
    }
    public static void display(Node root){
        if(root == null)
          return;
        
          //preorder traversal
           System.out.print(root.val+" ");
          display(root.left);
          display(root.right);
    }
}