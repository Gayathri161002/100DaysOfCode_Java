import java.util.*;
import java.util.regex.*;
public class URLValidator {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in); 
      String str=s.nextLine();
      
      Pattern p=Pattern.compile("((http|https)://)(www.)?[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)");
      Matcher m=p.matcher(str);
      
      if(m.find())
      {
          System.out.println("Valid");
      }
      else
      {
           System.out.println("Invalid");
      }
    }
}

/*
Input 1:
https://www.zoho.com
output :
valid
Input 2:
https://www.zoh!o.com
output :
Invalid
*/