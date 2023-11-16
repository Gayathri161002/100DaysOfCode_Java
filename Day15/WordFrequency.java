import java.util.*;

public class WordFrequency {
    public static void main(String args[]) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str=str.toLowerCase();
        char[] A=str.toCharArray();
        
        for (char c : A) 
        {
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        System.out.print(hmap);
    }
}
