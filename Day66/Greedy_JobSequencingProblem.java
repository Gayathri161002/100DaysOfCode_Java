import java.util.*;
public class Greedy_JobSequencingProblem 
{
    int id;
    int deadline;
    int profit;
    
    public Greedy_JobSequencingProblem(int id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    
    static void jobSequencing(ArrayList<Greedy_JobSequencingProblem> arr, int n)
    {
        Collections.sort(arr, (a,b) -> b.profit - a.profit);
        
        int max = 0;
        for (Greedy_JobSequencingProblem job : arr)
        {
            if (job.deadline > max)
            {
                max = job.deadline;
            }
        }
        
        int[] result = new int[max+1];
        Arrays.fill(result,-1);
        
        int jobCount = 0;
        int maxProfit = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=arr.get(i).deadline;j>0;j--)
            {
                if(result[j] == -1)
                {
                    result[j] = arr.get(i).id;
                    jobCount++;
                    maxProfit += arr.get(i).profit;
                    break;
                }
            }
        }
        
        System.out.println("Job Counts : " + jobCount + "\nMaximum Profit : " + maxProfit);
    }
    
    public static void main(String args[]) 
    {
        ArrayList<Greedy_JobSequencingProblem> arr = new ArrayList<Greedy_JobSequencingProblem>();
        arr.add(new Greedy_JobSequencingProblem(1,1,30));
        arr.add(new Greedy_JobSequencingProblem(2,1,20));
        arr.add(new Greedy_JobSequencingProblem(3,4,40));
        arr.add(new Greedy_JobSequencingProblem(4,1,10));
        
        jobSequencing(arr,4);
        
    }
}