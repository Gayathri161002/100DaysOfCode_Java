public class TreeAddSum
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
    
    public static int addSum(Tnode node)
    {
        int sum = 0;
        if(node == null)
        {
            return 0;
        }
        
        sum += node.data;
        
        int LeftVal = addSum(node.left);
        int RightVal = addSum(node.right);
        sum +=(LeftVal + RightVal);
        
        return sum; 
    }
    
    public static void main(String args[])
    {
        TreeAddSum obj = new TreeAddSum();
        root = new Tnode(1);
        Tnode r_left = new Tnode(2);
        Tnode r_right = new Tnode(3);
        Tnode rl_left = new Tnode(4);
        Tnode rl_right = new Tnode(5);
        Tnode rr_left = new Tnode(6);
        Tnode rr_right = new Tnode(7);
        root.left = r_left;
        root.right = r_right;
        r_left.left = rl_left;
        r_left.right = rl_right;
        r_right.left = rr_left;
        r_right.right = rr_right;
        int sum = addSum(root);
        System.out.println("Total Sum : " + sum);
    }
}

/*
Output :

Total Sum : 28

*/