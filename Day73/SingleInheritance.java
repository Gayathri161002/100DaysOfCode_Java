class Animal 
{
    void makeSound()
    {
        System.out.print("Animal makes sound...");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.print("Dog barks...");
    }
}
public class SingleInheritance 
{
    public static void main(String args[]) 
    {
        Dog dog = new Dog();
        dog.makeSound();
    }
}