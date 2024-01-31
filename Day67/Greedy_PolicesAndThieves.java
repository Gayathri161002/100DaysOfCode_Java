public class Greedy_PolicesAndThieves
{
    static int caughtThieves(int n,int k,char[] arr)
    {
        int[] polices = new int[n];
        int policesCount = 0;
        int[] thieves = new int[n];
        int thievesCount = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 'P')
            {
                polices[policesCount++] = i;
            }
            if(arr[i] == 'T')
            {
                thieves[thievesCount++] = i;
            }
        }
        
        int CaughtThieves = 0;
        
        for(int i=0;i<policesCount;i++)
        {
            int minDistance = Integer.MAX_VALUE;
            
            for(int j=0;j<thievesCount;j++)
            {
                int distance = Math.abs(polices[i] - thieves[j]);
                
                if(distance <= k && distance < minDistance)
                {
                    minDistance = distance;
                    CaughtThieves++;
                    thieves[j] = -1;
                    break;
                }
            }
        }
        return CaughtThieves;
    }
    public static void main(String args[]) 
    {
        int n = 5;
        int k = 1;
        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        
        System.out.println(caughtThieves(n,k,arr));
    }
}