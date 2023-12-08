import java.util.LinkedList;
public class GraphAdjacentList
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
    
    public static void display()
    {
        for(int i=0 ; i<graph.vertex ; i++)
        {
            System.out.print(i + " -> ");
            for(Integer v : graph.adjList[i])
            {
                System.out.print(v + " ");
            }
            System.out.println();
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
        display();
    }
}

/*
Output :

0 -> 1 3 
1 -> 0 2 4 
2 -> 1 
3 -> 0 4 
4 -> 3 1 

*/