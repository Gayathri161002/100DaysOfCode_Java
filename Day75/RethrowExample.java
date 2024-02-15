public class RethrowExample 
{
    static void divide(int a, int b) 
    {
        try 
        {
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch(ArithmeticException e) 
        {
            System.out.println("Caught exception in divide method: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }
    public static void main(String[] args) 
    {
        try 
        {
            divide(10, 0);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Caught exception in main method: " + e.getMessage());
        }
    }
}
