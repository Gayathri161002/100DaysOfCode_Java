import java.util.*;

public class VowelFrequency 
{
    public static void main(String args[]) 
{
        HashMap<Character, Integer> vfreq = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        char[] A = str.toCharArray();

        for (char c : A) 
       {
            if (isVowel(c))
           {
                vfreq.put(c, vfreq.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Vowel Frequency: " + vfreq);
    }

    public static boolean isVowel(char c) 
    {
        String str="aeiou";
        return str.indexOf(c) != -1;
    }
}

