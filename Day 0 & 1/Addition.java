import java.util.*;
public class Addition
{
    public static int sumOfTwoIntegers(int a,int b )
    {
           int s1=a+b;
           return s1;
    }
    public static void main(String[] args)
   {
          Scanner s=new Scanner (System.in);
          int a=s.nextInt();
          int b=s.nextInt();
          int sum=sumOfTwoIntegers(a,b);
          System.out.println(sum);
    }

}