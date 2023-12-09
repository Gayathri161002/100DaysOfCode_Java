import java.util.*;

public class GraphFloodFill 
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

    public static void floodFill(int[][] matrix, int startRow, int startCol, int targetColor, int newColor) 
    {
        if (startRow < 0 || startRow >= matrix.length || startCol < 0 || startCol >= matrix[0].length || matrix[startRow][startCol] != targetColor) 
        {
            return;
        }
        matrix[startRow][startCol]=newColor;
        int[][] directions={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for(int[] dir:directions){
            int newrow=startRow+dir[0];
            int newCol=startCol+dir[1];
            floodFill(matrix,newrow,newCol,targetColor,newColor);
        }
    }

    public static void main(String[] args) 
    {
        int totalVertices = 5;
        graph = new GraphNode(totalVertices);
        addEdge(0,1);
        addEdge(0,3);
        addEdge(2,4);
        
        int[][] matrix = {
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0}
        };

        int targetColor = 1;
        int newColor = 2;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] == targetColor) 
                {
                    floodFill(matrix, i, j, targetColor, newColor);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Output :

0 2 0 2 0 
2 0 0 0 0 
0 0 0 0 2 
2 0 0 0 0 
0 0 2 0 0 

*/