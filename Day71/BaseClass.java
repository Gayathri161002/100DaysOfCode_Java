class ClassA
{
    public ClassA()
    {
        System.out.println("Class A");
    }
}
class ClassB
{
    public ClassB()
    {
        System.out.println("Class B");
    }
}
public class BaseClass
{
    public static void main(String args[]) 
    {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
    }
}