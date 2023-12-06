public class TreeLeftView
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
    
    public static void leftView(Tnode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            System.out.print(node.data + " ");
            leftView(node.left);
        }
    }
    
    public static void main(String args[])
    {
        TreeLeftView obj = new TreeLeftView();
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
        
        leftView(root);
    }
}

/*
Output : 1 2 4 
*/