import java.util.*;
import java.util.regex.*;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
class AccountChecker
{
    String accNo;
    int pin;
    static int flag = 0;
    int[] pinDB = {1234, 4567, 7890, 6547, 1235, 4589, 1987, 4512, 4039, 2936}; 
    
    public AccountChecker(String accNo, int pin)
    {
        this.accNo = accNo;
        this.pin = pin;
    }
    
    void verifyAccount()
    {
        try
        {
            if(accNo.startsWith("91"))
            {
                System.out.println("Your Account is a Savings Account.");
                flag++;
            }
            else if(accNo.startsWith("95"))
            {
                System.out.println("Your Account is a current Account.");
                flag++;
            }
            else
            {
                throw new MyException("Your account number is not valid.");
            }
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    void verifyPin()
    {
        try
        {
            for(int i : pinDB)
            {
                if(i == pin)
                {
                    throw new MyException("Your pin number is not valid.");
                }
            }
            
            flag++;
        } 
        catch(Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    void isAllowedOrNot()
    {
        if(flag == 2)
        {
            System.out.println("Transaction is allowed.");
        }
        else
        {
            System.out.println("Transaction is not allowed.");
        }
    }

public class BankAccountVerifier
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter AccountNumber : ");
	    String accNo = s.nextLine();
	    System.out.println("Enter PinNumber (Pin number should have 4 numbers) : ");
	    int pin = s.nextInt();
		AccountChecker obj1 = new AccountChecker(accNo , pin);
		
		obj1.verifyAccount();
		obj1.verifyPin();
		
		obj1.isAllowedOrNot();
	}
}
