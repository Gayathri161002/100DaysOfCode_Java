public class BSTSearch
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
    
    public static boolean search(Tnode node,int target)
    {
        if(node == null)
        {
            return false;
        }
        
        if(node.data == target)
        {
            return true;
        }
        if(target > node.data)
        {
            return search(node.right,target);
        }
        else
        {
            return search(node.left,target);
        }
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
        BSTSearch obj = new BSTSearch();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        int target = 5;
        System.out.println(search(root,target));
    }
}

/*
Output : true
*/
