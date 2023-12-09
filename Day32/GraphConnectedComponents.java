/*
Graph Structure :

   0       2
 /  \      |      
 3  1      4         

Output : 

Connected Components : 
Component 0: 0 1 3 
Component 1: 2 4 

*/

import java.util.*;
public class GraphConnectedComponents
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
    
    public static void DFS(int totalVertices)
    {
        Boolean[] visited = new Boolean[totalVertices];
        Arrays.fill(visited,false);
        int[] compId = new int[totalVertices];
        int count = 0;
        for(int v=0; v<totalVertices;v++)
        {
            if(!visited[v])
            {
                DFSUtil(v,visited,compId,count);
                count++;
            }
        }
        
        System.out.println("Connected Components : ");
        
        for(int i=0;i<count;i++)
        { 
            System.out.print("Component " + i + ": ");
            for(int j=0;j<totalVertices;j++)
            {
                if(compId[j]==i)
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void DFSUtil(int v,Boolean[] visited,int[] compId,int count)
    {
        visited[v] = true;
        compId[v] = count;
        
        for(int n : graph.adjList[v])
        {
            if(!visited[n])
            {
                DFSUtil(n,visited,compId,count);
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
        DFS(totalVertices);
    }
}
