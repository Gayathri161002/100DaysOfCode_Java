/* ZigZag Traversal 

Tree Structure :

         1
        / \
       2   3
      / \ / \
     4  5 6  7
     
Output :  1 3 2 4 5 6 7   

*/

import java.util.Stack;
public class TreeZigzagTraversal
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
    
    public static void zigzag()
    {
        if(root == null)
        {
            return;
        }
        
        Stack<Tnode> currentStack = new Stack<>();
        Stack<Tnode> nextStack = new Stack<>();
        
        currentStack.push(root);
        boolean isLeftToRight = true;
        
        while(!currentStack.isEmpty())
        {
            Tnode node = currentStack.pop();
            System.out.print(node.data + " ");
            
            if(isLeftToRight)
            {
                if(node.left != null)
                {
                    nextStack.push(node.left);
                }
                if(node.right != null)
                {
                    nextStack.push(node.right);
                }
            }
            else
            {
                if(node.right != null)
                {
                    nextStack.push(node.right);
                }
                if(node.left != null)
                {
                    nextStack.push(node.left);
                }
            }
            
            if(currentStack.isEmpty())
            {
                isLeftToRight = !isLeftToRight;
                Stack<Tnode> temp = currentStack;
                currentStack = nextStack;
                nextStack = temp;
            }
        }
    }
    
    public static void main(String args[])
    {
        TreeZigzagTraversal obj = new TreeZigzagTraversal();
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
        zigzag();
    }
}
