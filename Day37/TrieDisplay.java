import java.util.*;
public class TrieDisplay
{
    private static TrieNode root;
    private static class TrieNode
    {
        private TrieNode[] children;
        private boolean flag;
        
        public TrieNode()
        {
            this.children = new TrieNode[26]; 
            this.flag = false;
        }
    }
    
    public static void insert(String str)
    {
        if(str == null)
        {
            System.out.println("Invalid Input");
        }

        str = str.toLowerCase();
        if(root == null)
        {
            root = new TrieNode();
        }
        
        TrieNode current = root;
        
        for(char ch : str.toCharArray())
        {
            int index = ch - 'a';
            
            if(current.children[index] == null)
            {
                TrieNode node = new TrieNode();
                current.children[index] = node;
            }

            current = current.children[index];
        }
        
        current.flag = true;
        
    }
    
    public static void display()
    {
        displayUtil(root,new StringBuilder());
    }
    
    public static void displayUtil(TrieNode node,StringBuilder words)
    {
        if(node.flag)
        {
            System.out.println(words.toString());
        }
        
        for(int i=0;i<26;i++)
        {
            if(node.children[i] != null)
            {
                displayUtil(node.children[i] , new StringBuilder(words).append((char)('a' + i)));
            }
        }
    }
    
    public static void main(String[] args)
    {
        TrieDisplay trie = new TrieDisplay();
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("api");
        trie.insert("axe");
        
        display();
    }
}

/*

Output :
api
apple
apps
axe

*/