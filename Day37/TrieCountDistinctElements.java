/*
Count Distinct Elements ::

String : abab

Substrings : " " , "a" ,"ab" ,"aba" , "abab" , "ba" , "bab" , "b"

Output : 8

*/

import java.util.*;
public class TrieCountDistinctElements
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
    
    public static int countDistinctElements(String str)
    {
        int count = 0;
        
        for(int i=0;i<=str.length();i++)
        {
            TrieNode current = root;
            
            for(int j=i;j<str.length();j++)
            {
                char ch = str.charAt(j);
                if(current.children[ch - 'a'] == null)
                {
                    current.children[ch - 'a'] = new TrieNode();
                    current.flag = true;
                    count++;
                }
                current = current.children[ch - 'a'];
            }
        }
        
        return count+1;
    }
    
    public static void main(String[] args)
    {
        TrieCountDistinctElements trie = new TrieCountDistinctElements();
        trie.insert("");
    
        System.out.println(trie.countDistinctElements("abab"));
    }
}
