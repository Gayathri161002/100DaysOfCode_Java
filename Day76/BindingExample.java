/*
static binding :
     When type of the object is determined at compiled time(by the compiler), it is known as static binding.

Dynamic binding :
     When type of the object is determined at run-time, it is known as dynamic binding.
*/
class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

public class BindingExample 
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();

        animal1.sound(); // Static Binding
        animal2.sound(); // Dynamic Binding
    }
}

/*
Output :

Animal makes a sound
Dog barks
*/