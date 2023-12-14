import java.util.*;
public class GraphSafeNode
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
        graph.edge++;
    }
    
    public static boolean dfs(int node,int[] visited,int[] pathVisit)
    {
        visited[node] = 1;
        pathVisit[node] = 1;
        
        for(int i : graph.adjList[node])
        {
            if(visited[i] == 0)
            {
                if(dfs(i,visited,pathVisit))
                {
                    return true;
                }
            }
            
            else if(pathVisit[i] == 1)
            {
                return true;
            }
        }
        
        pathVisit[node] = 0;
        return false;
    }
    
    public static void SafeNode(int size)
    {
        int[] visited = new int[size];
        Arrays.fill(visited,0);
        int[] pathVisit = new int[size];
        Arrays.fill(pathVisit,0);
        int[] check = new int[size];
        Arrays.fill(check,0);
        
        LinkedList<Integer> safenodes = new LinkedList<>();
        
        for(int i=0;i<size;i++)
        {
            if(visited[i] == 0)
            {
                if(!dfs(i,visited,pathVisit))
                {
                    check[i] = 1;
                    safenodes.add(i);
                }
            }
        }
        
        System.out.println(safenodes);
    }
    
    public static void main(String args[])
    {
        int totalVertices = 6;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(1,2);
        addEdge(3,4);
        addEdge(4,5);
        
        SafeNode(totalVertices);
    }
}