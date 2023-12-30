import java.util.*;
public class RecursionPhonePadReturn
{
    static ArrayList<String> phonePad(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3 ;i < digit * 3 ;i++)
        {
            char ch = (char)(i + 'a');
            ans.addAll(phonePad(p + ch , up.substring(1)));
        }
        return ans;
    }
    public static void main(String args[])
    {
       String str = "23";
       System.out.println(phonePad("",str));
    }
}