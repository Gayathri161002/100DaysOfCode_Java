class Animal
{
    void makeSound()
    {
        System.out.println("Animal sounds!!!");
    }
}
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Barks");
    }
}
class Cat extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("meow");
    }
}
public class RunTimePolymorphism
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
       d.makeSound();
       Cat c = new Cat(); 
        c.makeSound();
     }
}
