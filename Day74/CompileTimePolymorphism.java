class SquareValue
{
    int getSquareValue(int val)
    {
        return val*val;
    }
    
    double getSquareValue(double val)
    {
        return val*val;
    }
}
public class CompileTimePolymorphism
{
     public static void main(String[] args)
    {
        SquareValue s1 = new SquareValue();
        System.out.println(s1.getSquareValue(5));
        System.out.println(s1.getSquareValue(5.0));
     }
}
