/* Mixin class :

A mixin class is a class that provides a specific set of functionalities that can be mixed into other classes.

*/

class Callee
{
    void calleeMethod(String msg)
    {
        System.out.println("Messege : " + msg);
    }
}

class Caller extends Callee
{
    void callerMethod()
    {
        calleeMethod("Hey There...!!!");
    }
}

public class MixinExample
{
    public static void main(String args[]) 
    {
        Caller caller = new Caller();
        caller.callerMethod();
    }
}