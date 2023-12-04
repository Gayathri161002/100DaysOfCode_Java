/* Program to Implement Preorder Traversal of Binary Tree using Iteration
Tree Structure :

             1
        2           3
    4       5   6      7     
    
PreOdrer Traversal : 1 2 4 5 3 6 7 
*/

import java.util.Stack;
public class IterativePreOrder
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
    
    public static void preOrder(Tnode current)
    {
        if(current == null)
        {
            return;
        }
        
        Stack<Tnode> stk = new Stack<>();
        stk.push(current);
        
        while(stk.empty() == false)
        {
            Tnode temp = stk.peek();
            System.out.print(temp.data + " ");
            stk.pop();
            
            if(temp.right != null)
            {
                stk.push(temp.right);
            }
            
            if(temp.left != null)
            {
                stk.push(temp.left);
            }
        }
        
    }
    
    public static void main(String args[])
    {
        IterativePreOrder obj = new IterativePreOrder();
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
        preOrder(root);
    }
}