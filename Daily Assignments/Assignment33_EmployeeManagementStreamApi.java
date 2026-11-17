package dailyassignments;
import java.util.*;
import java.util.stream.Collectors;
//Question 1: Employee Management System – Java Stream API
//Create an Employee class with the following two fields:
//•	String name,double salary
//1.Create an Employee class with the above two fields.
class Employee1
{
	String name;
	double salary;
	//2.Create a constructor to initialize these fields.
	public Employee1(String name, double salary)
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Assignment33_EmployeeManagementStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.	Create 4 Employee objects.
		Employee1 obj1=new Employee1("Amit",45000);
		Employee1 obj2=new Employee1("Rahul",65000);
		Employee1 obj3=new Employee1("Anjali",75000);
		Employee1 obj4=new Employee1("Priya",40000);
		
		
		//4.	Store all employees in an ArrayList<Employee>.
		List<Employee1>list=new ArrayList<Employee1>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		//it's used to print the sample output
		System.out.println("Name Salary");
		for (Employee1 obj:list)
		{
			System.out.println();
			System.out.println(obj.name+":"+obj.salary);
			System.out.println();
		}
		//5.Use Stream API's filter() to find employees whose salary is greater than ₹50,000.
		System.out.println("Employees earning more than 50000:");
		
		List<Employee1>filterList1=
		list.stream().filter
		(s->s.getSalary()>50000).collect(Collectors.toList());
		
		//6.Use forEach() to print the name and salary of filtered employees.
		//list contains all 4 employees.
		//filterList1 contains only employees whose salary is greater than ₹50,000.
		filterList1.stream().forEach(s->System.out.println(s.name+"-"+s.salary));
		
		
		
		
		
		

	}

}
