/*
Create an employee Class with different types of employees.  Permanent, 
Consolidated and Consolidated_Regular.  Permanent employees will have 
all benefits.  Consolidated employees will be getting less benefits.  
Consolidated regular employees will get medium benefits.  
Benefits.  Permanent employees :  Basic, PF, TA, DA = Total Salary
	Consolidated employees: Day_salary * no. of working days.  Leave only on Sundays
	Consolidated Regular Employees:  Monthly salary + TA + Over Time work.  

Use the same method salary for every class and calculate the salary.  
The Permanent employees is the base class. 
consolidated, consolidated regular employees are 
the subclasses.  use necessary inheritance concept and method overloading and implement the concept using java
*/

package javaPrograms;

class PermanentEmployee
{
	int Basic = 15000;
	int PF = 4000;
	int TA = 5000;
	int DA = 5000;
	
	void calculateSalary()
	{
		int totalSalary = Basic + PF + TA + DA;
		
		System.out.println("Total salary for permanent employee : " + totalSalary);
	}
}

class ConsolidatedEmployee extends PermanentEmployee
{
	int daySalary = 500;
	
	void calculateSalary(int noOfDays)
	{
        int totalSalary = daySalary * noOfDays;
		
		System.out.println("Total salary for consolidated employee : " + totalSalary);
	}
}

class ConsolidatedRegularEmployee extends PermanentEmployee
{
	int salary = 8000;
    int TA = 4000;
    
    
	void calculateSalary(int OTHours)
	{
        int totalSalary = salary + TA + (OTHours*100);
		
		System.out.println("Total salary for consolidated regular employee : " + totalSalary);
	}
}

public class EmployeeProgram 
{
	public static void main(String[] args) 
	{
		PermanentEmployee p = new PermanentEmployee();
		p.calculateSalary();
		
		ConsolidatedEmployee ce = new ConsolidatedEmployee();
		ce.calculateSalary(28);
		
		ConsolidatedRegularEmployee cre = new ConsolidatedRegularEmployee();
		cre.calculateSalary(5);
	}

}
