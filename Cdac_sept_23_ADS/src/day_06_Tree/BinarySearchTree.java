
package day_06_Tree;
class Node
{
    Node left;
    int data;
    Node right;
     
   public Node(int data)
   {
       this.left=null;
       this.data=data;
       this.right=null;
   }
}


public class BinarySearchTree {
    
    Node root;
        public Node insertNode(Node root,int val)
        {
            if(root==null)
            {
                return new Node(val);
            }
            else if(root.data<val)
                root.right=insertNode(root.right,val);
            else
                root.left=insertNode(root.left,val);
            return root;
        }
        
        public boolean search(Node root,int val)
        {
            if(root==null)
                return false;
            if(root.data==val)
                return true;
            if(root.data<val)
               return  search(root.right,val);
            else
                return search(root.left,val);
        }
        public void inorder(Node root)
        {
            if(root==null)
                return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
         public void preorder(Node root)
        {
            if(root==null)
                return;
            System.out.println(root.data);
            preorder(root.left);
            
            preorder(root.right);
        }
         
         public void postorder(Node root)
         {
             if(root==null)
                 return;
             postorder(root.left);
             postorder(root.right);
             System.out.println(root.data);
             
             
                     
         }

        public Node delete(Node root,int val){
        if(root==null)
            return null;
        else if(root.data<val)
            root.right=delete(root.right, val);
        else if(root.data>val)
            root.left=delete(root.left, val);
        else{
            if(root.left==null && root.right==null)
                return null;
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                int rightMin=getRightMin(root.right);
                root.data=rightMin;
                root.right=delete(root.right, rightMin);
            }
        }
        return root;
    }
    private int getRightMin(Node right) {
        Node temp=right;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        
        BinarySearchTree bst=new BinarySearchTree();
        bst.root=bst.insertNode(bst.root, 100);
         bst.root=bst.insertNode(bst.root, 50);
          bst.root=bst.insertNode(bst.root, 10);
           bst.root=bst.insertNode(bst.root, 250);
            bst.root=bst.insertNode(bst.root, 150);
             bst.root=bst.insertNode(bst.root, 300);
           System.out.println("Inorder");
           
           bst.inorder(bst.root);
           
           System.out.println("preorder");
           
           bst.preorder(bst.root);
           
           System.out.println("postorder");
           
           bst.preorder(bst.root);
           
                   
           
//              System.out.println( bst.search(bst.root, 600));
//    bst.delete(bst.root,100);
//    
//        System.out.println("After deleting");
//        bst.inorder(bst.root);
        
    }

    
}
