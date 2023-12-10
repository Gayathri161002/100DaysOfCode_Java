import java.util.*;

public class DirectedGraphCycle 
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

    public static void addDirectedEdge(int fromVertex, int toVertex) 
    {
        graph.adjList[fromVertex].add(toVertex);
        graph.edge++;
    }

    public static boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) 
    {
        if (!visited[v]) 
        {
            visited[v] = true;
            recStack[v] = true;

            for (Integer i : graph.adjList[v]) 
            {
                if (!visited[i] && isCyclicUtil(i, visited, recStack)) 
                {
                    return true;
                } 
                else if (recStack[i])
                {
                    return true;
                }
            }
        }
        recStack[v] = false;
        return false;
    }

    public static boolean isCyclic(int size) 
    {
        boolean[] visited = new boolean[size];
        boolean[] recStack = new boolean[size];

        for (int i = 0; i < size; i++) 
        {
            if (!visited[i]) 
            {
                if (isCyclicUtil(i, visited, recStack)) 
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int totalVertices = 5;
        graph = new GraphNode(totalVertices);

        addDirectedEdge(0, 1);
        addDirectedEdge(0, 2);
        addDirectedEdge(2, 3);
        addDirectedEdge(2, 4);
        addDirectedEdge(3, 4);

        if (isCyclic(totalVertices)) {
            System.out.println("Cyclic");
        } else {
            System.out.println("Not Cyclic");
        }
    }
}

/* 
Output :
Not Cyclic

*/