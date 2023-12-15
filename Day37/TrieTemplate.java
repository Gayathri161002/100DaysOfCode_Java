public class TrieTemplate
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
}