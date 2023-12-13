/* https://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/ 

Output : c a b

*/


import java.util.*;
public class AlienDictionary
{
    public static void addEdge(ArrayList<Integer>[] arr,char u,char v)
    {
        arr[u - 'a'].add(v - 'a');
    }
    
    static void dfs(ArrayList<Integer>[] arr, int[] col, int curr, boolean[] isCyclic) 
    {
		col[curr] = 1;

		for (int i = 0; i < arr[curr].size(); i++) 
		{
			int x = arr[curr].get(i);
			if (col[x] == 1) 
			{
				isCyclic[0] = true;
				return;
			} 
			else if (col[x] == 0) 
			{
				dfs(arr, col, x, isCyclic);
			}
		}

		col[curr] = 2;
	}

	static boolean checkCycle(ArrayList<Integer>[] arr, int[] col, int k)
	{
		boolean[] isCyclic = {false};
		for (int i = 0; i < k; i++) 
		{
			if (col[i] == 0) 
			{
				dfs(arr, col, i, isCyclic);
			}
		}
		return isCyclic[0];
	}
    
    public static void topologicalSortUtil(ArrayList<Integer>[] arr,int u,boolean[] visited,Stack<Integer> stk)
    {
        visited[u] = true;
        
        for (int i = 0; i < arr[u].size(); i++) 
        {
			int v = arr[u].get(i);
			if (!visited[v]) 
			{
				topologicalSortUtil(arr, v, visited, stk);
			}
		}
        stk.push(u);
    }
    
    public static void topologicalSort(ArrayList<Integer>[] arr,int k)
    {
        boolean[] visited = new boolean[k];
        Arrays.fill(visited,false);
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < k; i++) 
        {
			if (!visited[i]) 
			{
				topologicalSortUtil(arr, i, visited, stk);
			}
		}
        
        while(!stk.isEmpty())
        {
            System.out.print((char)(stk.pop()+'a') + " ");
        }
    }
    
    public static void dictionaryOrder(String[] words,int len)
    {
        int[] freq = new int[26];
        int k = 0;
        
        for(int i=0;i<len;i++)
        {
            String s = words[i];
            for(int j = 0; j < s.length(); j++)
            {
                freq[s.charAt(j) -'a']++;
                if(freq[s.charAt(j) -'a']==1)
                {
                    k++;
                }
            }
        }
        
        ArrayList<Integer>[] arr = new ArrayList[k];
        for(int i=0;i<k;i++)
        {
            arr[i] = new ArrayList<>();
        }
        
        for(int i=0;i<len-1;i++)
        {
            String s1 = words[i];
            String s2 = words[i+1];
            
            int j = 0;
            
            while(j<s1.length() && j<s2.length())
            {
                if(s1.charAt(j) != s2.charAt(j))
                {
                    addEdge(arr,s1.charAt(j),s2.charAt(j));
                    break;
                }
                j++;
            }
        }
        
        int[] col = new int[k];
		if (checkCycle(arr, col, k)) 
		{
			System.out.println("Valid Order is not possible");
			return;
		}
		
        topologicalSort(arr,k);
        
    }
    
    public static void main(String args[]) 
    {
        String[] words = {"caa", "aaa", "aab"};
        int len = words.length;
        
        dictionaryOrder(words,len);
    }
}