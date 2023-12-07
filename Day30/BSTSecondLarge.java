/*
Binary Search Tree :
    4
   / \
  2   5
 / \   \
1   3   6

Output : 
  Second Largest in BST is : 5

*/

public class BSTSecondLarge
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
    
    public static void secLargeUtil(Tnode root,int c)
    {
        if(root == null || c>=2)
        {
            return;
        }
        
        c++;
        secLargeUtil(root.right,c);
        
        if(c==2)
        {
            System.out.println("Second Largest in BST is : " + root.data);
            return;
        }
        
    }
    
    public static void secLarge(Tnode root)
    {
        int c = 0;
        
        secLargeUtil(root,c);
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
        BSTSecondLarge obj = new BSTSecondLarge();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        secLarge(root);
    }
}