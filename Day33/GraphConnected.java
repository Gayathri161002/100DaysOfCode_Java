import java.util.*;

public class GraphConnected 
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

            for (int i = 0; i < data; i++) 
            {
                this.adjList[i] = new LinkedList<>();
            }
        }
    }

    public static void addEdge(int vertex, int edge) 
    {
        graph.adjList[vertex].add(edge);
        graph.adjList[edge].add(vertex);
        graph.edge++;
    }

    public static boolean isConnectedGraph(int totalVertices) 
    {
        Boolean[] visited = new Boolean[totalVertices];
        Arrays.fill(visited, false);

        DFSUtil(0, visited);
        int count = 0;
        for (int v = 0; v < totalVertices; v++)
        {
            if (visited[v]) 
            {
                count++;
            }
        }
        
        return count == totalVertices;
        
    }

    public static void DFSUtil(int v, Boolean[] visited) 
    {
        visited[v] = true;

        for (int neighbor : graph.adjList[v]) 
        {
            if (!visited[neighbor])
            {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public static void main(String args[]) {
        int totalVertices = 4;
        graph = new GraphNode(totalVertices);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);

        System.out.println(isConnectedGraph(totalVertices));
    }
}
