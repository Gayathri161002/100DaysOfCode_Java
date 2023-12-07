public class BSTPathSum
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
    
    static int result = Integer.MIN_VALUE;
    public static int pathSum(Tnode root)
    {
        pathSumUtil(root);
        return result;
    }
    
    public static int pathSumUtil(Tnode root)
    {
        if(root == null)
        {
            return 0;
        }
        
        int left = pathSumUtil(root.left);
        int right = pathSumUtil(root.right);
        left = Math.max(0,left);
        right = Math.max(0,right);
        
        int pathsum = left + right +root.data;
        
        result = Math.max(result,pathsum);
        
        return result;
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
        BSTPathSum obj = new BSTPathSum();
        root = insert(root,4);
        insert(root,2);
        insert(root,1);
        insert(root,3);
        insert(root,5);
        insert(root,6);
        System.out.println(pathSum(root));
    }
}

/*
Output : 21
*/