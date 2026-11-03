package dailyassignments;
abstract class Employeee
{
	int employeeeId;
	String employeeeName;
	
	abstract int calculateSalary();
	
	void displayDetails()
	{
		System.out.println("Employee Id: " + employeeeId + "\nEmployee Name: " + employeeeName);
	}
}
class FullTimeEmployeee extends Employeee
{
	
	int monthlySalary;
	FullTimeEmployeee(int employeeeId, String employeeeName, int monthlySalary )// we are just giving the constructor to pass the input in the object itself
	{
		this.employeeeId=employeeeId;
		this.employeeeName=employeeeName;
		this.monthlySalary=monthlySalary;
	}
	int calculateSalary()
	{
		return monthlySalary;	
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Monthly Salary:"+monthlySalary);
	}
}
class PartTimeEmployeee extends Employeee
{
	int hoursWorked;
	int hourlyRate;
	
	PartTimeEmployeee(int employeeeId, String employeeeName, int hoursWorked, int hourlyRate)
	{
		this.employeeeId=employeeeId;
		this.employeeeName=employeeeName;
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}

	int calculateSalary()
	{
		return hoursWorked * hourlyRate;	
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Hours Worked :"+hoursWorked+"\nHourly Rate :"+hourlyRate);
		System.out.println("Calculated Salary: $" + this.calculateSalary());
	}
}
public class Assignment28_AbstractEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Full-Time Employee -----");
		FullTimeEmployeee fte= new FullTimeEmployeee(101,"Rahul",50000);
		fte.displayDetails();
		System.out.println("----- Part-Time Employee -----");
		PartTimeEmployeee pte= new PartTimeEmployeee(102,"Amit",80,300);
		pte.employeeeId=102;
		pte.employeeeName="Amit";
		pte.displayDetails();
		
	}

}
