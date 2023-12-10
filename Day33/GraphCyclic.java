/*
Graph Structure :

     0
    / \
   1   2
      / \    //Cycle 2-3-4
     3---4
     
     
Output : Cyclic

*/
import java.util.*;
public class GraphCyclic
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
    
    public static boolean isCyclicUtil(int v, boolean[] visited, int parent) 
    {
        visited[v] = true;

        for (Integer i : graph.adjList[v]) 
        {
            if (!visited[i]) 
            {
                if (isCyclicUtil(i, visited, v)) 
                {
                    return true;
                }
            } 
            else if (visited[i] && i != parent)
            {
                return true;
            }
        }
        return false;
   }
    
    public static boolean isCyclic(int size)
    {
        boolean[] visited = new boolean[size];
        Arrays.fill(visited,false);
        
        for(int i=0;i<size;i++)
        {
            if(!visited[i])
            {
                if(isCyclicUtil(i,visited,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        int totalVertices = 5;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(0,2);
        addEdge(2,3);
        addEdge(2,4);
        addEdge(3,4);
        if(isCyclic(totalVertices))
        {
            System.out.println("Cyclic");
        }
        else
        {
            System.out.println("Acyclic");
        }
    }
}
