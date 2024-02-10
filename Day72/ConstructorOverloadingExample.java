class Student
{
    int rno;
    String name;
    
    public Student(int rno, String name)
    {
        this.rno = rno;
        this.name = name;
    }
    
    public Student()
    {
        this.rno = 102;
        this.name = "Mithun";
    }
    
    void display()
    {
        System.out.println("Roll no : " + this.rno + "\nName : " + this.name);
    }
}
public class ConstructorOverloadingExample 
{
    public static void main(String args[]) 
    {
        Student stud1 = new Student(101,"Rio");
        stud1.display();
        
        Student stud2 = new Student();
        stud2.display();
        
    }
}