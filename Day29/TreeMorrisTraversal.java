/*
Morris Traversal :
Using Morris Traversal, we can traverse the tree without using stack and recursion.

Output :
1 2 4 5 3 6 7 

*/

public class TreeMorrisTraversal 
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

    private static Tnode findPredecessor(Tnode node) 
    {
        Tnode pred = node.left;
        while (pred.right != null && pred.right != node) 
        {
            pred = pred.right;
        }
        return pred;
    }

    public static void morrisPreorderTraversal(Tnode node) 
    {
        while (node != null)
        {
            if (node.left == null) 
            {
                System.out.print(node.data + " ");
                node = node.right;
            }
            else 
            {
                Tnode predecessor = findPredecessor(node);

                if (predecessor.right == null) 
                {
                    System.out.print(node.data + " ");
                    predecessor.right = node;
                    node = node.left;
                } 
                else
                {
                    predecessor.right = null;
                    node = node.right;
                }
            }
        }
    }

    public static void main(String args[]) 
    {
        TreeMorrisTraversal obj = new TreeMorrisTraversal();
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
        morrisPreorderTraversal(root);
    }
}

