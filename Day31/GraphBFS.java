import java.util.*;
public class GraphBFS
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
    
    public static void BFS(int totalVertices)
    {
        Boolean[] visited = new Boolean[totalVertices];
        Arrays.fill(visited,false);
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        
        while(!q.isEmpty())
        {
            int v = q.poll();
            
            if(!visited[v])
            {
                visited[v] = true;
                System.out.print(v + " ");
            } 
            
            for(int n : graph.adjList[v])
            {
                if(!visited[n])
                {
                    q.offer(n);
                }
            }
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
        BFS(totalVertices);
    }
}

/*

Output : 0 1 3 2 4 

*/