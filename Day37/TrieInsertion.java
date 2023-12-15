import java.util.*;
public class TrieInsertion
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
    
    public static void main(String[] args)
    {
        TrieInsertion trie = new TrieInsertion();
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("api");
        trie.insert("axe");
        
    }
}