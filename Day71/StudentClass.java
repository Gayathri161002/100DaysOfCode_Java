class Student
{
    int rno;
    String name;
    int marks;
    
    public Student(int rno, String name, int marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    
    void display()
    {
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}

public class StudentClass
{
    public static void main(String args[]) 
    {
        Student stud1 = new Student(22, "Mugen", 90);   
        stud1.display();
        Student stud2 = new Student(24, "Viraj", 89);   
        stud2.display();
    }
}

