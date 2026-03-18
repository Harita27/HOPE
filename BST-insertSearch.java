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
  boolean searchBST(Node root,int key){
    if(root==null){
      return false;
    }
    if(root.val==key){
      return true;
    }
    if(key<root.val){
      return searchBST(root.left,key);
    }
    if(key>root.val){
       return searchBST(root.right,key);
    }
    return false;
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
      int key=sc.nextInt();
      System.out.println(b.searchBST(b.root,key));
    
    }
}
