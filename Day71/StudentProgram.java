/* 
Question :
Provide object-oriented representation for the requirement below:

Every student is identified by name and roll-number. Each student belongs to one class having standard-number and section. Each class is taught 5 subjects handled by different teacher. One of the teacher will be class-teacher for a particular class.

*/

class Subject
{
    String subjects;
    String staff;
    
    public Subject(String subjects,String staff)
    {
        this.subjects = subjects;
        this.staff = staff;
    }
}

class Teacher
{
    String name;
    
    public Teacher(String name)
    {
        this.name = name;
    }
}

class ClassRoom
{
    int std;
    char section;
    Teacher classTeacher;
    Subject[] subjects;
    
    public ClassRoom(int std, char section, Teacher classTeacher, Subject[] subjects)
    {
        this.std = std;
        this.section = section;
        this.classTeacher = classTeacher;
        this.subjects = subjects;
    }
}

class Student
{
    int rno;
    String name;
    ClassRoom classRoom;
    
    public Student(int rno, String name, ClassRoom classRoom)
    {
        this.rno = rno;
        this.name = name;
        this.classRoom = classRoom;
    }
    
    void display()
    {
        System.out.println("Roll no : " + rno);
        System.out.println("Name : " + name);
        System.out.println("Standard and Section : " + classRoom.std + " " + classRoom.section);
        System.out.println("Subjects:");
        for (Subject subject : classRoom.subjects) 
        {
            System.out.println("- " + subject.subjects + " handled by " + subject.staff);
        }
    }
}

public class StudentProgram
{
    public static void main(String args[]) 
    {
        Subject tamil = new Subject("Tamil", "Priya");
        Subject english = new Subject("English", "Diya");
        Subject maths = new Subject("Maths", "Mithun");
        Subject science = new Subject("Science", "Siva");
        Subject social = new Subject("Social", "Sujithra");
        
        Teacher classTeacher = new Teacher("Mithra");
        
        ClassRoom classA = new ClassRoom(12, 'A', classTeacher,new Subject[]{tamil, english, maths, science, social});
        
        Student stud1 = new Student(22, "Mugen" , classA);
        
        stud1.display();
    }
}

/*
Output :

Roll no : 22
Name : Mugen
Standard and Section : 12 A
Subjects:
- Tamil handled by Priya
- English handled by Diya
- Maths handled by Mithun
- Science handled by Siva
- Social handled by Sujithra

*/