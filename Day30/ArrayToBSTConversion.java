public class ArrayToBSTConversion
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
    
    public static Tnode arrayToBST(int[] A,int start,int end)
    {
        if(start > end)
        {
            return null;
        }
        int mid = (start+end)/2;
        
        Tnode node = new Tnode(A[mid]);
        node.left = arrayToBST(A,start,mid-1);
        node.right = arrayToBST(A,mid+1,end);
        
        return node;
    }
    
    public static void main(String args[])
    {
        int[] A = {1,2,3,4,5};
        root = arrayToBST(A , 0 , A.length-1);
        displayPreOrder(root);
    }
}