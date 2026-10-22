package dailyassignments;
/*Task 1: Use of this Keyword 
Create a class named Employee with the following instance variables:
•	int employeeId
•	String employeeName
•	double salary
Requirements:
1.	Create a parameterized constructor that initializes all three instance variables.
2.	Use the this keyword to distinguish instance variables from constructor parameters.
3.	Create a method named displayDetails() to display employee information.
4.	Create two employee objects with different values and display their details.*/
class Employee
{
	int employeeId;
	String employeeName;
	double salary;
	
	Employee(int employeeId, String employeeName, double salary)
	
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}
	void displayDetails()
	{
		System.out.println(this.employeeId+":"+this.employeeName+":"+this.salary);
	}
	/*1.	Create a class named Employee with a final method named calculateBonus().*/
	final void calculateBonus()
	{
		System.out.println("calculate Bonus: 6000");
	}
}
/*Task 2: Use of final Variables 
Create a class named Company with the following:
1.	A final variable named COMPANY_NAME, initialized to "Tech Solutions Pvt. Ltd.".
2.	A final variable named MAX_EMPLOYEES, initialized to 100.
3.	A method that displays the company name and maximum employee limit.
4.	Try changing the value of a final variable and observe the compiler error.*/
class Company
{
	final String COMPANY_NAME="Tech Solutions Pvt.Ltd.";
	final int MAX_EMPLOYEES=100;
	void displays()
	{
		System.out.println(this.COMPANY_NAME+":"+this.MAX_EMPLOYEES);
		this.MAX_EMPLOYEES=209;//we can't change the value, since we have made the value as final	
	}
}
/*Task 3: Use of final Methods 
1.	Create a class named Employee with a final method named calculateBonus().
2.	Create a subclass named Manager that extends Employee.
3.	Try overriding calculateBonus() in Manager.
4.	Observe the compiler error and explain why the method cannot be overridden.*/
class Manager extends Employee
{
	void calculateBonus()//final method in the class employee can't be inherited in the subclass which is manager
	{
		System.out.println("calculate Bonus: 8000");
	}
}
/*Task 3: Use of final Classes 
1.	Create a class named SecurityPolicy and declare it as final.
2.	Add a method named displayPolicy().
3.	Create another class named AdminPolicy that attempts to extend SecurityPolicy.
4.	Observe the compiler error and explain why a final class cannot be inherited.*/
final class SecurityPolicy
{
	void displayPolicy()
	{
		System.out.println("Policy: InsurancePolicy");
	}
}
class AdminPolicy extends SecurityPolicy//final class cannot be extended
{

	void displayPolicy() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Assignment24_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee(101,"Dharshu",430.9);
		obj.displayDetails();
		Employee obj1=new Employee(102,"Krishnan",5004.23);
		obj1.displayDetails();
		Company obj2=new Company();
		obj2.displays();
		AdminPolicy ap=new AdminPolicy();
		ap.displayPolicy();
		
	}

}
