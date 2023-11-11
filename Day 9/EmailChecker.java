import java.util.*;
import java.util.regex.*;

public class EmailChecker
{
    
    public static boolean isValidEmail(String str)
    {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,7}$";
        
        Pattern p=Pattern.compile(emailPattern);
        Matcher m=p.matcher(str);
	    if(str==null)
	    {
	        return false;
	    }
	    return m.matches();
    }
    public static void main(String[] args)
	{
	    ArrayList<String> A = new ArrayList<String>(); 
	    
	    A.add("review-team@geeksforgeeks.org"); 
		A.add("writing.geeksforgeeks.org"); 
	   
	    for(String i : A)
	    {
	        if(isValidEmail(i))
	        {
	            System.out.println("valid");
	        }
	        else
	        {
	            System.out.println("invalid");
	        }
	    }
	    
	}
}
