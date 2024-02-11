class Employee 
{
    int empNo;
    String name;
    
    public Employee(int empNo, String name)
    {
        this.empNo = empNo;
        this.name = name;
    }
    
    int getEmpNo(int empNo)
    {
        return empNo;
    }
    
    String getName(String name)
    {
        return name;
    }
}

class Manager extends Employee
{
    String dpt;
    public Manager(int empNo, String name, String dpt)
    {
        super(empNo,name);  // Call the constructor of Employee
        this.dpt = dpt;
    }
    
    String getDpt(String dpt)
    {
        return dpt;
    }
}

class Executive extends Manager
{
    int salary;
    public Executive(int empNo, String name, String dpt, int salary)
    {
        super(empNo,name,dpt);  // Call the constructor of Manager
        this.salary = salary;
    }
    
    int getSalary(int salary)
    {
        return salary;
    }
    
    void display()
    {
        System.out.println("EmpNo : " + this.empNo);
        System.out.println("Name : " + this.name);
        System.out.println("Department : " + this.dpt);
        System.out.println("Salary : " + this.salary);
    }
}

public class MultilevelInheritance 
{
    public static void main(String args[]) 
    {
        Executive executive = new Executive(101,"Mugen","Software Development",50000);
        executive.display();
        
    }
}