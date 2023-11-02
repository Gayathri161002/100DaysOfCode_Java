import java.util.*;
public class BitwiseOperator
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int num1=s.nextInt();
	    int num2=s.nextInt();
	    
	    System.out.println("num1 & num2 = " + (num1&num2));
	    System.out.println("num1 | num2 = " + (num1|num2));
	    System.out.println("num1 ^ num2 = " + (num1^num2));
	    System.out.println("~num1 = " + (~num1));
	    System.out.println("~num2 = " + (~num2));
	}

}
