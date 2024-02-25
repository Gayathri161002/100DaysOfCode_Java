/*
Consider an organization.  There are 4 units.  Welding,  Cutting, Heating and Assembling. 
Input employee no, employee name, nature of work as inputs 
through parameters.  If any employee is on leave in a particular department, 
then one of the employees in other departments should take care of the 
work in other departments.  Example.  If an employee is leave in Welding department, 
then Cutting department employee should take care of the work.  
If Any employee is on leave in heating, then welding or cutting department employees should take care.  
Use Method overriding concept for the changing of the nature of work.  
Here, pass employee specialty as one of the parameter. 
 And print his name in case of leave on any other department employee.
*/

package javaPrograms;
import java.util.Scanner;

class Organization
{
	String name;
	int id;
	String team;
	
	public Organization() {}
	
	public Organization(String name,int id,String team)
	{
		this.name = name;
		this.id = id;
		this.team = team;
	}
	
	void empDetails() {}
}

class Welding extends Organization
{	
	public Welding() {}
	
	public Welding(String name, int id, String team)
	{
		super(name, id, team);
	}
	
	void empDetails(Welding[] weldingTeam)
	{
		System.out.println("***********************Welding Team***********************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("If any one getting leave ? {true / false} : ");
		boolean isleave = sc.nextBoolean();
		int leaveId = 0;
		
		if(isleave)
		{
			System.out.println("Enter the Emp id (starts with 11) : ");
			leaveId = sc.nextInt();
			
			System.out.println(leaveId + " can be replaced by cutting department employee Id " + (leaveId+100));
		}
		
		System.out.println("\nTotal employees on Welding department are...\n");
		
		for(Welding w : weldingTeam)
		{
			if(leaveId == w.id)
			{
				System.out.println(w.name + " is on leave. So he is replaced by cutting team employee with the Id :" + (leaveId+100));
			}
			else
			{
				System.out.println("Name : " + w.name + " Id : " + w.id + " Speciality : " + w.team);
			}	
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		
	}
}

class Cutting extends Organization
{
	public Cutting() { }
	
	public Cutting(String name, int id, String team)
	{
		super(name, id, team);
	}
	
	void empDetails(Cutting[] CuttingTeam)
	{
		System.out.println("***********************Cutting Team***********************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("If any one getting leave ? {true / false} : ");
		boolean isleave = sc.nextBoolean();
		int leaveId = 0;
		
		if(isleave)
		{
			System.out.println("Enter the Emp id (starts with 21) : ");
			leaveId = sc.nextInt();
			
			System.out.println(leaveId + " can be replaced by cutting department employee Id " + (leaveId+100));
		}
		
		System.out.println("\nTotal employees on Cutting department are...\n");
		
		for(Cutting w : CuttingTeam)
		{
			if(leaveId == w.id)
			{
				System.out.println(w.name + " is on leave. So he is replaced by Heating team employee with the Id :" + (leaveId+100));
			}
			else
			{
				System.out.println("Name : " + w.name + " Id : " + w.id + " Speciality : " + w.team);
			}	
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		
	}
}

class Heating extends Organization
{
	public Heating() { }
	
	public Heating(String name, int id, String team) 
	{
		super(name, id, team);
	}
	
	void empDetails(Heating[] HeatingTeam)
	{
		System.out.println("***********************Heating Team***********************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("If any one getting leave ? {true / false} : ");
		boolean isleave = sc.nextBoolean();
		int leaveId = 0;
		
		if(isleave)
		{
			System.out.println("Enter the Emp id (starts with 31) : ");
			leaveId = sc.nextInt();
			
			System.out.println(leaveId + " can be replaced by assembly department employee Id " + (leaveId+100));
		}
		
		System.out.println("\nTotal employees on Heating department are...\n");
		
		for(Heating w : HeatingTeam)
		{
			if(leaveId == w.id)
			{
				System.out.println(w.name + " is on leave. So he is replaced by assembly team employee with the Id :" + (leaveId+100));
			}
			else
			{
				System.out.println("Name : " + w.name + " Id : " + w.id + " Speciality : " + w.team);
			}	
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		
	}
}

class Assembly extends Organization
{

	public Assembly() { }
	
	public Assembly(String name, int id, String team)
	{
		super(name, id, team);
	}
	
	void empDetails(Assembly[] AssemblyTeam)
	{
		System.out.println("***********************Assembly Team***********************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("If any one getting leave ? {true / false} : ");
		boolean isleave = sc.nextBoolean();
		int leaveId = 0;
		
		if(isleave)
		{
			System.out.println("Enter the Emp id (starts with 41) : ");
			leaveId = sc.nextInt();
			
			System.out.println(leaveId + " can be replaced by welding department employee Id " + (leaveId+100));
		}
		
		System.out.println("\nTotal employees on Assembly department are...\n");
		
		for(Assembly w : AssemblyTeam)
		{
			if(leaveId == w.id)
			{
				System.out.println(w.name + " is on leave. So he is replaced by welding team employee with the Id :" + (leaveId-300));
			}
			else
			{
				System.out.println("Name : " + w.name + " Id : " + w.id + " Speciality : " + w.team);
			}	
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		
	}
}

public class OrganizationProgram 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of employees in Welding team : ");
		int wno = s.nextInt();
		Welding[] weldingTeam = new Welding[wno];
		for(int i=0;i<wno;i++)
		{
			Welding w = new Welding("WeldEmployee" + (i+1) , 110+(i+1),"Welding");
			weldingTeam[i] = w;
		}
		
		System.out.println("Enter no of employees in Cutting team : ");
		int cno = s.nextInt();
		Cutting[] cuttingTeam = new Cutting[cno];
		for(int i=0;i<cno;i++)
		{
			Cutting c = new Cutting("CutEmployee" + (i+1) , 210+(i+1),"Cutting");
			cuttingTeam[i] = c;
		}
		
		System.out.println("Enter no of employees in Heating team : ");
		int hno = s.nextInt();
		Heating[] heatingTeam = new Heating[hno];
		for(int i=0;i<hno;i++)
		{
			Heating h = new Heating("HeatEmployee" + (i+1) , 310+(i+1),"Heating");
			heatingTeam[i] = h;
		}
		
		System.out.println("Enter no of employees in Assembly team : ");
		int ano = s.nextInt();
		Assembly[] assemblyTeam = new Assembly[ano];
		for(int i=0;i<ano;i++)
		{
			Assembly a = new Assembly("AssemblyEmployee" + (i+1) , 410+(i+1),"Assembly");
			assemblyTeam[i] = a;
		}
		
		Welding welding = new Welding();
		welding.empDetails(weldingTeam);
		
		Cutting cutting = new Cutting();
		cutting.empDetails(cuttingTeam);
		
		Heating heating = new Heating();
		heating.empDetails(heatingTeam);
		
		Assembly assembly = new Assembly();
		assembly.empDetails(assemblyTeam);
	}

}
