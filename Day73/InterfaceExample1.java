interface Vehicle
{
    int speedOfVehicle(int speed);
    int noOfWheels();
}

class Bike implements Vehicle
{
    int wheels = 2;
    
    public int speedOfVehicle(int speed)
    {
        return speed;
    }
    
    public int noOfWheels()
    {
        return wheels;
    }
}

class Car implements Vehicle
{
    int wheels = 4;
    
    public int speedOfVehicle(int speed)
    {
        return speed;
    }
    
    public int noOfWheels()
    {
        return wheels;
    }
}

public class InterfaceExample1
{
    public static void main(String args[])
    {
        Car car = new Car();
        System.out.println("Speed of Car : " + car.speedOfVehicle(100));
        System.out.println("No of Wheels : " + car.noOfWheels());
        
        Bike bike = new Bike();
        System.out.println("Speed of Bike : " + bike.speedOfVehicle(150));
        System.out.println("No of Wheels : " + bike.noOfWheels());
    }
}