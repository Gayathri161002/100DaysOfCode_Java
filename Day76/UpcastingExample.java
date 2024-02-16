/*
Upcasting:

Upcasting involves casting a reference from a subclass type to a superclass type.
It is implicit and does not require explicit casting syntax.
Upcasting is always safe and allowed because a subclass object can always be treated as an instance of its superclass.
Upcasting is often used in scenarios where you want to treat objects generically, without worrying about their specific types.

*/
class Parent 
{
    void display()
    {
        System.out.println("Parent class");
    }
}

class Child extends Parent
{
    void display() 
    {
        System.out.println("Child class");
    }
}

public class UpcastingExample
{
    public static void main(String[] args) 
    {
        Parent parent = new Child(); // Implicit casting (upcasting)
        parent.display(); 
    }
}

// Output: Child class