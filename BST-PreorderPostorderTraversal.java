import java.util.*;
class Node{
  int val;
  Node left;
  Node right;
  Node(int data){
    val=data;
    left=null;
    right=null;
  }
}
class BST{
  Node root;
  Node insertBST(Node root,int val){
    if(root==null){
      return new Node(val);
    }
    if(val<root.val){
      root.left=insertBST(root.left,val);
    }
    if(val>root.val){
      root.right=insertBST(root.right,val);
    }
    return root;
  }
  void preorder(Node root){
    if(root==null){
      return;
    } System.out.println(root.val);
      preorder(root.left);
      preorder(root.right);
    
  }
  void postorder(Node root){
    if(root==null){
      return;
    } postorder(root.left);
      postorder(root.right);
      System.out.println(root.val);
    
  }
}

public class Main {
    public static void main(String[] args) {   
      Scanner sc=new Scanner(System.in);
      BST b=new BST();
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
        int val=sc.nextInt();
        b.root=b.insertBST(b.root,val);
        System.out.println(val+" inserted");
      }
      System.out.println("Preorder Traversal");
      b.preorder(b.root);
      System.out.println("Postorder Traversal");
      b.postorder(b.root);
    
    }
}
