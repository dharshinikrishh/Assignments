package dailyassignments;

import java.util.*;

class Employee2
{
	String name;
	double salary;
	public Employee2(String name, double salary) 
	{
		this.name = name;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}
public class Assignment34_EmployeeSalaryAnalysisUsingStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 obj1=new Employee2("Rahul",50000);
		Employee2 obj2=new Employee2("Priya",70000);
		Employee2 obj3=new Employee2("Amit",60000);
		
		List<Employee2>list=new ArrayList<Employee2>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		//Tasks:
		//1. Use Stream API to sort employees by salary in ascending order.

		System.out.println("Sort Employees by Salary in Ascending Order");
		list
		.stream()
		.sorted(Comparator.comparingDouble(Employee2::getSalary))
		.forEach(e->System.out.println(e.getName()+":"+e.getSalary()));
		
		
		//2. Use Stream API to sort employees by salary in descending order.
		System.out.println("\nSort Employees by Salary in Descending Order");
		list
		.stream()
		.sorted(Comparator.comparing(Employee2::getSalary).reversed())
		.forEach(e->System.out.println(e.getName()+":"+e.getSalary()));
		
		//3. Use Stream API to calculate the total salary of all employees using mapToDouble() and sum()
	 System.out.println("\nCalculate the Total Salary of all Employess");
		
		double sum=
				list
				.stream()
				.map(Employee2::getSalary)
				.mapToDouble(Double::doubleValue)
				.sum();
		System.out.println(sum);
		
		

	}

}
