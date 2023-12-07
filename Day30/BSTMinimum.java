/*
Binary Search Tree :
    4
   / \
  2   5
 / \   \
1   3   6

Output : 
  Minimum : 1

*/

public class BSTMinimum
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
    
    public static int minimum(Tnode node)
    {
        if(node != null)
        {
            if(node.left != null)
            {
                return minimum(node.left);
            }
            else
            {
                return node.data;
            }
        }
        return Integer.MAX_VALUE;
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
        BSTMinimum obj = new BSTMinimum();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        int min = minimum(root);
        System.out.println("Minimum : " + min);
    }
}