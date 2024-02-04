public class Greedy_WateringPlants 
{

    static int minSprinklers(int[] gallery, int n)
    {
        int[] sprinklers = new int[n];

        for (int i = 0; i < n; i++) 
        {
            if (gallery[i] != -1) 
            {
                int start = Math.max(0, i - gallery[i]);
                int end = Math.min(n - 1, i + gallery[i]);

                for (int j = start; j <= end; j++) 
                {
                    sprinklers[j] = Math.max(sprinklers[j], end);
                }
            }
        }

        int sprinklerCount = 0;
        int i = 0;

        while (i < n)
        {
            if (sprinklers[i] == 0) 
            {
                return -1; // No sprinkler to water the current partition
            }

            sprinklerCount++;
            i = sprinklers[i] + 1;
        }

        return sprinklerCount;
    }

    public static void main(String[] args) 
    {
        int n = 6;
        int[] gallery = {-1, 2, 2, -1, 0, 0};
        System.out.println(minSprinklers(gallery, n)); 

    }
}
