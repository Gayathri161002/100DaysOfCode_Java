/* It returns the number of connected graphs.

Output : 2

*/

import java.util.*;
public class GraphNumProvinces
{
    public static GraphNode graph;
    public static class GraphNode
    {
        private static int vertex;
        private static int edge;
        LinkedList<Integer>[] adjList;
        
        public GraphNode(int data)
        {
            this.vertex = data;
            this.edge = 0;
            this.adjList = new LinkedList[data];
            for(int i=0;i<data;i++)
            {
                this.adjList[i] = new LinkedList<>();
            }
        }
    }
    
    public static void addEdge(int v,int e)
    {
        graph.adjList[v].add(e);
        graph.adjList[e].add(v);
        graph.edge++;
    }
    
    public static void dfs(int node,int[] visited)
    {
        visited[node] = 1;
        
        for(int i : graph.adjList[node])
        {
            if(visited[i] == 0)
            {
                dfs(i,visited);
            }
        }
    }
    
    public static int provincesNum(int size)
    {
        int[] visited = new int[size];
        Arrays.fill(visited,0);
        int count = 0;
        
        for(int i=0;i<size;i++)
        {
            if(visited[i] == 0)
            {
                count++;
                dfs(i,visited);
            }
        }
        return count;
    }
    
    public static void main(String args[])
    {
        int totalVertices = 6;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(4,5);
        System.out.println(provincesNum(totalVertices));
    }
}