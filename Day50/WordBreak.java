import java.util.*;
public class WordBreak
{
    static boolean wordBreak(List<String> wordList,String word)
    {
        if(word.length() == 0)
        {
            return true;
        }
        
        int len = word.length();
        
        for(int i=1;i<=len;++i)
        {
            String substr = word.substring(0,i);
            
            if(wordList.contains(substr) && wordBreak(wordList,word.substring(i)))
            {
                return true;
            }
        }
        
        return false;
    }
    public static void main(String args[]) 
    {
        List<String> wordList = Arrays.asList(
            "mobile", "samsung", "sam", "sung", "man",
            "mango", "icecream", "and", "go", "i", "like",
            "ice", "cream");

        boolean result = wordBreak(wordList, "ilikeicecream");

        System.out.println(result);
    }
}