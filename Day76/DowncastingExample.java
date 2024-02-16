/*
Downcasting:

Downcasting involves casting a reference from a superclass type to a subclass type.
It is explicit and requires explicit casting syntax, as it may lead to runtime errors if the object being casted is not actually an instance of the subclass type.
Downcasting is used when you need to access methods or fields specific to the subclass that are not available in the superclass.

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
    void show() 
    {
        System.out.println("Child class");
    }
}

public class DowncastingExample 
{
    public static void main(String[] args) 
    {
        Parent parent = new Child(); // Upcasting (implicit)
        Child child = (Child) parent; // Downcasting (explicit)
        child.display(); 
        child.show(); 
    }
}

/*
Output: Parent class
Output: Child class
*/