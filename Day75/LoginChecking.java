import java.util.*;
import java.util.regex.*;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
class LoginCredentials
{
    String userName;
    String password;
    
    public LoginCredentials(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }
    
    void verifyUserName()
    {
        try
        {
            Pattern p = Pattern.compile("[a-zA-Z0-9]");
            Matcher m = p.matcher(userName);
            if(!m.find() || userName.length() < 8)
            {
                throw new MyException("Username is Not Valid....give a valid username");
            }
            else
            {
                System.out.println("Give Username is valid");
            }
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    void verifyPassword()
    {
        try
        {
            Pattern p = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9])");
            Matcher m = p.matcher(password);
            if(!m.find() || password.length() < 8)
            {
                throw new MyException("Password is Not Valid....give a valid password");
            }
            else
            {
                System.out.println("Give password is valid");
            }
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
public class LoginChecking
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter username : ");
	    String Username = s.nextLine();
	    System.out.println("Enter password : ");
	    String password = s.nextLine();
		LoginCredentials obj1 = new LoginCredentials(Username , password);
		
		obj1.verifyUserName();
		obj1.verifyPassword();
	}
}
