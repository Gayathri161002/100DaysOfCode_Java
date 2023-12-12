/*
Bipartite graph :
Key idea : It can be coloured using two colours such that no two adjacent nodes have same colour.

Output : true

*/

import java.util.*;
public class GraphBipartite
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
    
    public static boolean isBipartiteUtil(int val ,int[] color)
    {
        Queue<Integer> q = new LinkedList<>();
        q.offer(val);
        color[val] = 0;
        
        while(!q.isEmpty())
        {
            int node = q.poll();
            
            for(int v : graph.adjList[node])
            {
                if(color[v]==-1)
                {
                    color[v] = 1-color[node];
                    q.offer(v);
                }
                else if(color[v] == color[node])
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isBipartite(int size)
    {
        int[] color = new int[size];
        Arrays.fill(color,-1);
        
        for(int i=0;i<size;i++)
        {
            if(color[i] == -1)
            {
                if(!isBipartiteUtil(i,color))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        int totalVertices = 5;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(0,3);
        addEdge(1,2);
        addEdge(3,4);
        addEdge(4,1);
        System.out.println(isBipartite(totalVertices));
    }
}
