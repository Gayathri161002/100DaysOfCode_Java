import java.util.*;

public class RemoveAdjacentDuplicate
{
    public static String removeAdjacentDuplicate(String str) 
    {
        Stack<Character> stk = new Stack<>();

        for (char s : str.toCharArray()) 
        {
            if (!stk.isEmpty() && stk.peek().equals(s)) 
            {
                stk.pop();
            }
            else 
            {
                stk.push(s);
            }
        }

        StringBuilder result = new StringBuilder();
        Iterator i = stk.iterator();
        
        while(i.hasNext())
        {
            result.append(i.next());
        }

        return result.toString();
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = removeAdjacentDuplicate(str);
        System.out.println(result);
    }
}

/*
Example 1:

Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:

Input: s = "azxxzy"
Output: "ay"
*/