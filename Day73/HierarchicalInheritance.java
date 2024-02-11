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
        super(empNo,name);  
        this.dpt = dpt;
    }
    
    String getDpt(String dpt)
    {
        return dpt;
    }
}

class Developer extends Employee
{
    String dpt;
    public Developer(int empNo, String name, String dpt)
    {
        super(empNo,name); 
        this.dpt = dpt;
    }
    
    String getDpt(String dpt)
    {
        return dpt;
    }
}

class Tester extends Employee
{
    String dpt;
    public Tester(int empNo, String name, String dpt)
    {
        super(empNo,name);  
        this.dpt = dpt;
    }
    
    String getDpt(String dpt)
    {
        return dpt;
    }
}

public class HierarchicalInheritance 
{
    public static void main(String args[]) 
    {
        Developer developer = new Developer(101,"Mugen","Developer");
        System.out.println("EmpNo : " + developer.empNo + "\nName : " + developer.name + "\nDepartment : " + developer.dpt);
        
        Tester tester = new Tester(102,"Mithun","Tester");
        System.out.println("EmpNo : " + tester.empNo + "\nName : " + tester.name + "\nDepartment : " + tester.dpt);
        
    }
}