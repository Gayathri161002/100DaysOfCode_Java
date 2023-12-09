/*
Graph Structure :

   0  1  2  3  4
0  0  1  0  1  0  // one island {(0,3) , (1,3)}
1  1  0  0  1  0
2  0  0  0  0  1
3  1  1  0  0  0  // one island {(3,0) , (3,1)}
4  0  0  1  0  0
   
Output : 
Number of Islands : 2

*/

import java.util.*;
public class GraphIslands
{
    private static GraphNode graph;
    
    public static class GraphNode
    {
        private int vertex;
        private int edge;
        private LinkedList<Integer>[] adjList;
        
        public GraphNode(int data)
        {
            this.vertex = data;
            this.edge = 0;
            this.adjList = new LinkedList[data];
            
            for(int i=0 ; i<data ;i++)
            {
                this.adjList[i] = new LinkedList<>();
            }
        }
    }
    
    public static void addEdge(int vertex , int edge)
    {
        graph.adjList[vertex].add(edge);
        graph.adjList[edge].add(vertex);
        graph.edge++;
    }
    
    public static int countIslands(int totalVertices)
    {
        Boolean[] visited = new Boolean[totalVertices];
        Arrays.fill(visited,false);
        int count = 0;
        for(int v=0; v<totalVertices;v++)
        {
            if(!visited[v])
            {
                DFSUtil(v,visited);
                count++;
            }
        }
        
        return count;
    }
    
    public static void DFSUtil(int v,Boolean[] visited)
    {
        visited[v] = true;
        for(int n : graph.adjList[v])
        {
            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }
    }
    
    public static void main(String args[])
    {
        int totalVertices = 5;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(0,3);
        addEdge(2,4);
        int result = countIslands(totalVertices);
        System.out.println("Number of Islands : " + result);
    }
}
