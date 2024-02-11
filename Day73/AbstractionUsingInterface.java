interface Shape
{
    double area();
}

class Circle implements Shape
{
    double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape
{
    double len;
    double width;
    
    public Rectangle(double len, double width)
    {
        this.len = len;
        this.width = width;
    }
    
    public double area()
    {
        return len*width;
    }
}

public class AbstractionUsingInterface
{
    public static void main(String args[])
    {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle : " + circle.area());
        
        Rectangle rect = new Rectangle(5,10);
        System.out.println("Area of Rectangle : " + rect.area());
    }
}