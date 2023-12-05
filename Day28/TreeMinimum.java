/* Find minimum in Binary Tree using Recursion 

Output :

Minimum : 41

*/

public class TreeMinimum
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
        if(node == null)
        {
            return Integer.MAX_VALUE;
        }
        
        int result = node.data;
        
        int LeftResult = minimum(node.left);
        int RightResult = minimum(node.right);
        
        if(LeftResult < result)
        {
            result = LeftResult;
        }
        if(RightResult < result)
        {
            result = RightResult;
        }
        
        return result;
    }
    
    public static void main(String args[])
    {
        TreeMinimum obj = new TreeMinimum();
        root = new Tnode(51);
        Tnode r_left = new Tnode(92);
        Tnode r_right = new Tnode(43);
        Tnode rl_left = new Tnode(41);
        Tnode rl_right = new Tnode(55);
        Tnode rr_left = new Tnode(68);
        Tnode rr_right = new Tnode(79);
        root.left = r_left;
        root.right = r_right;
        r_left.left = rl_left;
        r_left.right = rl_right;
        r_right.left = rr_left;
        r_right.right = rr_right;
        int min = minimum(root);
        System.out.println("Minimum : " + min);
    }
}