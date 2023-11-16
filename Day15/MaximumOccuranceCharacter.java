import java.util.*;

public class MaximumOccuranceCharacter
{
    public static char maxOccurance(HashMap<Character, Integer> hmap)
    {
        char max_char = ' ';
        int count=-1;
        
        for(Map.Entry<Character, Integer> entry : hmap.entrySet())
        {
            if(entry.getValue() > count)
            {
                max_char = entry.getKey();
                count=entry.getValue();
            }
        }
        return max_char;
    }
    public static void main(String args[]) 
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str=str.toLowerCase();
        char[] A=str.toCharArray();
        
        for (char c : A) 
        {
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        
        char maxChar = maxOccurance(hmap);
        int count=hmap.get(maxChar);
        
        System.out.print(maxChar + " : " + count );
    }
}
