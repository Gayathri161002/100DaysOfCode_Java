public class GraphAdjacentMatrix
{
    private static GraphNode graph;
    
    public static class GraphNode
    {
        private int vertex;
        private int edge;
        private  int[][] adjMatrix;
        
        public GraphNode(int data)
        {
            this.vertex = data;
            this.edge = 0;
            this.adjMatrix = new int[data][data];
        }
    }
    
    public static void addEdge(int v , int e)
    {
        graph.adjMatrix[v][e] = 1;
        graph.adjMatrix[e][v] = 1;
        graph.edge++;
    }
    
    public static void display(int totalVertices)
    {
        for(int i=0 ; i<totalVertices ; i++)
        {
            for(int j=0 ; j<totalVertices ; j++)
            {
                System.out.print(graph.adjMatrix[i][j] + " ");
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
        
        display(totalVertices);
    }
}

/*
Output :

0 1 0 1 0 
1 0 1 0 1 
0 1 0 0 0 
1 0 0 0 1 
0 1 0 1 0 

*/