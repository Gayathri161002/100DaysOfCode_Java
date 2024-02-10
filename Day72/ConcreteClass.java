/* Concrete class :

A concrete class in Java is a class that can be instantiated, meaning objects can be created from it.
It provides complete implementations for all its methods and can have data members (fields or attributes) 
and methods that define the behavior of the objects instantiated from it. Unlike abstract classes, 
concrete classes do not have any abstract methods without implementations.

*/

class Person
{
    String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String getName(String name)
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    void display()
    {
        System.out.println("Name : " + this.name);
    }
}
public class ConcreteClass 
{
    public static void main(String args[]) 
    {
        Person person = new Person("Mugen");
        person.display();
    }
}