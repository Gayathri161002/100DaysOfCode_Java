import java.util.*;
public class TreeFindLevel
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
    
    public static int findLevel()
    {
        if(root == null)
        {
            return -1;
        }
        int currentLevel = 0;
        Queue<Tnode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            
            for(int i=0;i<levelSize;i++)
            {
                Tnode node = queue.poll();
                if(node.left != null)
                {
                    queue.add(node.left);
                }
                if(node.right != null)
                {
                    queue.add(node.right);
                }
            }
            
            currentLevel++;
        }
        
        return currentLevel;
    }
    
    public static void main(String args[])
    {
        TreeFindLevel obj = new TreeFindLevel();
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
        System.out.println(findLevel());
    }
}

/*
Output : 3
*/