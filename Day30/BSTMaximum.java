/*
Binary Search Tree :
    4
   / \
  2   5
 / \   \
1   3   6

Output : 
  Maximum : 6

*/

public class BSTMaximum
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
    
    public static int maximum(Tnode node)
    {
        if(node != null)
        {
            if(node.right != null)
            {
                return maximum(node.right);
            }
            else
            {
                return node.data;
            }
        }
        return Integer.MIN_VALUE;
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
        BSTMaximum obj = new BSTMaximum();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        int max = maximum(root);
        System.out.println("Maximum : " + max);
    }
}