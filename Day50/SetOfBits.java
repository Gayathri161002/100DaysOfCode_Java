public class SetOfBits
{
    static int setOfBits(int n,int count)
    {
        if(n == 0)
        {
            return count;
        }
        
        if(n % 2 != 0)
        {
            count++;
        }
        
        return setOfBits(n/2,count);
    }
    public static void main(String args[]) 
    {
        int n = 10;
        System.out.println(setOfBits(n,0));
    }
}