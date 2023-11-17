import java.util.*;

public class RemoveVowels 
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase();
        char[] A=str.toCharArray();
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!='a' && A[i]!='e' && A[i]!='i' && A[i]!='o' && A[i]!='u')
            {
                hmap.put(A[i],count++);
            }
        }
        
        System.out.print(hmap);
    }
}