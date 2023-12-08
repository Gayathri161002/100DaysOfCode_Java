public class Graph
{
    private static GraphNode graph;
    
    private static class GraphNode
    {
        private int vertex;
        private int edge;
        private  int[][] adjMatrix;
        
        public Graphnode(int data)
        {
            this.vertex = data;
            this.edge = 0;
            this.adjMatrix = new int[data][data];
        }
    }
}