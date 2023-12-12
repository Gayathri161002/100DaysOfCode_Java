/*
Topological sort :
Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge u-v, vertex u comes before v in the ordering.

Output : 0 3 4 1 2 

*/

import java.util.*;
public class GraphTopologicalSort
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
        graph.edge++;
    }
    
    public static void topologicalSortUtil(int val,int[] visited,Stack<Integer> stk)
    {
        visited[val] = 1;
        
        for(int v : graph.adjList[val])
        {
            if(visited[v]==0)
            {
                topologicalSortUtil(v,visited,stk);
            }
        }
        stk.push(val);
    }
    
    public static void topologicalSort(int size)
    {
        int[] visited = new int[size];
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(visited,0);
        
        for(int i : visited)
        {
            if(i==0)
            {
                topologicalSortUtil(i,visited,stk);
            }
        }
        
        while(!stk.isEmpty())
        {
            System.out.print(stk.pop() + " ");
        }
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
        topologicalSort(totalVertices);
    }
}
