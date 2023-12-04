/* Program to Implement Postorder Traversal of Binary Tree using Iteration
Tree Structure :

             1
        2           3
    4       5   6      7     
    
PreOdrer Traversal : 4 5 2 6 7 3 1 
*/

import java.util.Stack;
public class IterativePostOrder
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
    
    public static void postOrder()
    {
        if(root == null)
        {
            return;
        }
        
        Stack<Tnode> stk = new Stack<>();
        Tnode current = root;
        
        while(!stk.isEmpty() || current != null)
        {
            if(current != null)
            {
                stk.push(current);
                current = current.left;
            }
            
            else
            {
                Tnode temp = stk.peek().right;
                if(temp == null)
                {
                    temp = stk.pop();
                    System.out.print(temp.data + " ");
                    
                    while(!stk.isEmpty() && temp == stk.peek().right)
                    {
                        temp = stk.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else
                {
                    current = temp;
                }
            }
        }
        
    }
    
    public static void main(String args[])
    {
        IterativePostOrder obj = new IterativePostOrder();
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
        postOrder();
    }
}