import java.util.*;

public class GraphRottenOrange
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

    public static int rottenOrange(int[][] matrix) 
    {
        if(matrix == null || matrix.length == 0) 
            return 0;
            
        int rows = matrix.length;
        int cols = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        for(int i = 0 ; i < rows ; i++) 
        {
            for(int j = 0 ; j < cols ; j++) 
            {
                if(matrix[i][j] == 2) {
                    queue.offer(new int[]{i , j});
                }
                else if(matrix[i][j] == 1) 
                {
                    count_fresh++;
                }
            }
        }
        
        if(count_fresh == 0)
            return 0;
            
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while(!queue.isEmpty()) 
        {
            ++count;
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) 
            {
                int[] point = queue.poll();
                for(int dir[] : dirs) 
                {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    
                    if(x < 0 || y < 0 || x >= rows || y >= cols || matrix[x][y] == 0 || matrix[x][y] == 2) 
                        continue;
                    
                    matrix[x][y] = 2;
                    
                    queue.offer(new int[]{x , y});
                    
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count-1 : -1;
    }

    public static void main(String args[]) 
    {
        int totalVertices = 4;
        graph = new GraphNode(totalVertices);
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);

        int[][] matrix = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        System.out.println(rottenOrange(matrix));

    }
}

/*

Output : 4

*/