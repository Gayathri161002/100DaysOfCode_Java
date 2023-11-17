import java.util.*;

public class Anagram
{
    public static boolean isAnagram(String str1,String str2)
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        char[] A=str1.toCharArray();
        char[] B=str2.toCharArray();
        
        for(int i=0;i<A.length;i++)
        {
            hmap.put(A[i],hmap.getOrDefault(A[i], 0) + 1);
        }
        
        for(char c : B)
        {
            if(!(hmap.containsKey(c)))
            {
               return false;
            }
            
            hmap.put(c, hmap.get(c) - 1);

            
            if(hmap.get(c)==0)
            {
                hmap.remove(c);
            }
        }
        
        return hmap.isEmpty();
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println(isAnagram(str1,str2));
    }
}