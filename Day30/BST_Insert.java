/*
Binary Search Tree :
    4
   / \
  2   5
 / \   \
1   3   6

Output :  4 2 1 3 5 6 

*/

public class BST_Insert
{
    private static Tnode root;
    
    static class Tnode
    {
        private Tnode left;
        private Tnode right;
        private int data;
        
        public Tnode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void displayPreOrder(Tnode node)
    {
        if(node == null)
        {
            return;
        }
        
        System.out.print(node.data + " ");
        displayPreOrder(node.left);
        displayPreOrder(node.right);
    }
    
    public static Tnode insert(Tnode root,int val)
    {
        if(root == null)
        {
            root = new Tnode(val);
            return root;
        }
        if(val < root.data )
        {
            root.left = insert(root.left,val);
        }
        else
        {
            root.right = insert(root.right,val);
        }
        
        return root;
    }
    
    public static void main(String args[])
    {
        BST_Insert obj = new BST_Insert();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        displayPreOrder(root);
    }
}