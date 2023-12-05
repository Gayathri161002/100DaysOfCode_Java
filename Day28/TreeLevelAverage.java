import java.util.*;
public class TreeLevelAverage
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
    
    public static void levelAverage()
    {
        if(root == null)
        {
            return;
        }
        
        Queue<Tnode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            int levelSum = 0;
            
            for(int i=0;i<levelSize;i++)
            {
                Tnode node = queue.poll();
                if(node != null)
                {
                    levelSum += node.data;
                    if(node.left != null)
                    {
                        queue.add(node.left);
                    }
                    if(node.right != null)
                    {
                        queue.add(node.right);
                    }
                }
            }
            if(levelSize > 0)
            {
                float avg = (float)levelSum/levelSize;
                System.out.println(avg);
                
            }
        }
    }
    
    public static void main(String args[])
    {
        TreeLevelAverage obj = new TreeLevelAverage();
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
        levelAverage();
    }
}

/*
Output :
1.0
2.5
5.5
*/