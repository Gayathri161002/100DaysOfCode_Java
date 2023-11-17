import java.util.*;

public class SpecificCharacterOccurance
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase();
        char[] A=str.toCharArray();
        
        char ch=s.next().charAt(0);
        
        for(int i=0;i<A.length;i++)
        {
            hmap.put(A[i],hmap.getOrDefault(A[i], 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry : hmap.entrySet())
        {
            if((entry.getKey())==ch)
            {
                System.out.print(entry.getValue());
                break;
            }
        }
        
    }
}