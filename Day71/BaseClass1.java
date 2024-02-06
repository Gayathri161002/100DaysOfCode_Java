class ClassA
{
    public ClassA()
    {
        System.out.println("Class A");
    }
}
class ClassB extends ClassA
{
    public ClassB()
    {
        System.out.println("Class B");
    }
}
public class BaseClass1
{
    public static void main(String args[]) 
    {
        ClassA a = new ClassA();   // inherits ClassA
        ClassB b = new ClassB();   // inherits both ClassA and ClassA
    }
}

/*
Output :
Class A
Class A
Class B

*/