abstract class Shape
{
    String color;
    
    abstract double area();
    
    public Shape(String color)
    {
        this.color = color;
    }
}

class Circle extends Shape
{
    double radius;
    
    public Circle(String color, double radius)
    {
        super(color);
        this.radius = radius;
    }
    
    @Override double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape
{
    double len;
    double width;
    
    public Rectangle(String color, double len, double width)
    {
        super(color);
        this.len = len;
        this.width = width;
    }
    
    @Override double area()
    {
        return len*width;
    }
}

public class AbstractionExample 
{
    public static void main(String args[])
    {
        Circle circle = new Circle("Blue",5);
        System.out.println("Area of Circle : " + circle.area());
        
        Rectangle rect = new Rectangle("Green",5,10);
        System.out.println("Area of Rectangle : " + rect.area());
    }
}