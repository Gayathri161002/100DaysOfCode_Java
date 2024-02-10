enum Day
{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}

public class EnumExample
{
    public static void main(String args[]) 
    {
        System.out.println("Days : ");
        for(Day day : Day.values())
        {
            System.out.print(day + " ");
        }
        
        Day today = Day.Friday;
        System.out.println("\nToday is : " + today);
        
        switch(today)
        {
            case Monday :
            case Tuesday :
            case Wednesday :
            case Thursday :
            case Friday :
                System.out.print("Its a Weekday");
                break;
            case Sunday :
            case Saturday :    
                System.out.print("Its a Weekend");
                break;
        }
        
    }
}