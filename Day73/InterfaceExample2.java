interface One
{
    final int value1 = 100;
}

interface Two
{
    final int value2 = 200;
}

class ValueClass implements One, Two
{
    void display()
    {
        System.out.println("Value from Interface One : " + value1);
        System.out.println("Value from Interface Two : " + value2);
    }
}


public class InterfaceExample2
{
    public static void main(String args[])
    {
        ValueClass obj = new ValueClass();
        obj.display();
    }
}