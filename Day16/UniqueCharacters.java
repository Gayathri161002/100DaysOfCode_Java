import java.util.*;

public class UniqueCharacters
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase();
        char[] A=str.toCharArray();
        for(int i=0;i<A.length;i++)
        {
            hmap.put(A[i],hmap.getOrDefault(A[i], 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : hmap.entrySet())
        {
            if((entry.getValue())==1)
            {
                System.out.print(entry.getKey());
            }
        }
        
    }
}