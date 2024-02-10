/* Singleton class :

A singleton class in Java is a class that allows only one instance of itself to be created and provides 
a global point of access to that instance. It is useful when exactly one object is needed to coordinate
actions across the system. The singleton pattern ensures that there is a single instance of the class and 
provides a way to access that instance from any other class.

*/

class Singleton
{
    private static Singleton instance;
    
    private Singleton()
    {
        // Private constructor to prevent instantiation from outside.
    }
    
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    
    void display()
    {
        System.out.println("Message from Singleton...!!!");
    }
}

public class SingletonExample
{
    public static void main(String args[]) 
    {
        Singleton singleton = Singleton.getInstance();
        singleton.display();
    }
}