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
  Node deleteNode(Node root,int val) {

        if(root==null) return null;

        if(val < root.val){
            root.left = deleteNode(root.left, val);
        }
        else if(val > root.val){
            root.right = deleteNode(root.right, val);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            Node max = findMax(root.left);
            root.val = max.val;
            root.left = deleteNode(root.left, max.val);
        }
        return root;
    }

    Node findMax(Node temp){
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;
    }
    Node LCA(Node root,int p,int q){
      if(root==null){
        return root;
      }
      if(p>root.val&& q>root.val){
        return LCA(root.right,p,q);
      }
      else if(p<root.val && q<root.val){
        return LCA(root.left,p,q);
      }
      return root;
    }
}
