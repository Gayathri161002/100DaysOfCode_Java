import java.util.regex.*;
public class RegexExample {
    public static void main(String args[]) 
    {
      String str="If you notice this notice, you will notice that this notice is worth noticing.";
      
      Pattern p=Pattern.compile("notice");
      Matcher m=p.matcher(str);
      
      while(m.find())
      {
          System.out.println("The pattern found from " + m.start() + " to " + m.end());
      }
    }
}