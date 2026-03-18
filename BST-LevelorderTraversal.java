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
  void LevelOrder(Node root){
    Queue<Node> q=new ArrayDeque<>();
    q.offer(root);
    while(!q.isEmpty()){
      Node cur= q.poll();
      System.out.print(cur.val+" ");
      if(cur.left!=null)  q.offer(cur.left);
      if(cur.right!=null) q.offer(cur.right);
    }
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
      System.out.println("Level Traversal");
      b.LevelOrder(b.root);
    
    }
}
