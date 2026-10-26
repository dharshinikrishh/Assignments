package dailyassignments;
class Student
{
	/*6.Create a static initialization block that prints a message when the Student class is initialized.*/
	static
	{
		System.out.println("Student class is initialized");
	}
	/*1Create a class Student with the following variables:
o	rollNumber — an instance variable.
o	name — an instance variable.
o	collegeName — a static variable initialized to "ABC Engineering College".
o	studentCount — a static variable to track the total number of student objects created*/
	
	int rollNumber;
	String name;
	static String collegeName="ABC Engineering College";//static variable for collegeName
	static int studentCount;//static variable of count of students.
	
	/*2.Create a parameterized constructor that accepts rollNumber and name. Every time a student object is created, increment studentCount.*/
	Student(int rollNumber, String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		studentCount++;//to increment the student count whenever the student object is created.
	}
	
	/*3.Create a static method changeCollegeName() that accepts a new college name and updates the static variable.*/
	static void changeCollegeName(String collegeName)
	{
	Student.collegeName=collegeName;// to accepts a new college name and updates the static variable.
	}
	
	/*4.Create an instance method displayDetails() that displays the student's roll number, name, and college name.*/
	void displayDetails()
	{
		System.out.println("Roll Number : "+rollNumber+"\n"+"Name:"+name+"\n"+"College :"+Student.collegeName);//collegeName is declared as static, so we are accessing through classname, since it doesn't belongs to object.
		System.out.println("\n");
	}
	
	/*5.Create a static method displayStudentCount() that prints the total number of student objects created.*/
	static void displayStudentCount()
	{
		System.out.print("Total Students:");
		System.out.println(studentCount);//it prints the total no.of.students, whenever the object is created.
		//return studentCount;
	}
	
}
public class Assignment25_StudentRecords {

	public static void main(String[] args) {
		/*In the main() method:
		/*1.	Create three student objects with different roll numbers and names.*/
		Student s1= new Student(101,"Rahul");
		Student s2= new Student(102,"Priya");
		Student s3= new Student(103,"Amit");
		System.out.println("\n");
		
		/*2.	Display the details of all three students.*/
		/*System.out.println("Roll Number : "+s1.rollNumber+"\n"+"Name :"+s1.name+"\n"+"College :"+Student.collegeName);//through class name we can call the variable, it's belongs to the class not to the object.
		System.out.println("\n");
		System.out.println("Roll Number :"+s2.rollNumber+"\n"+"Name :"+s2.name+"\n"+"College :"+Student.collegeName);
		System.out.println("\n");
		System.out.println("Roll Number :"+s3.rollNumber+"\n"+"Name :"+s3.name+"\n"+"College :"+Student.collegeName);*/
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		
		/*3.Display the total number of students created.*/
		System.out.println("Total number of Students created: "+Student.studentCount);
		
		System.out.println("College Name Updated Successfully");
		/*4.Change the college name to "XYZ Institute of Technology" using the static method.*/
		Student.changeCollegeName("XYZ Institute of Technology");
		System.out.println("\n");
	
		
		/*5.Display all three students' details again*/
		/*System.out.println("Roll Number : "+s1.rollNumber+"\n"+"Name :"+s1.name+"\n"+"College :"+Student.collegeName);//through class name we can call the variable, it's belongs to the class not to the object.
		System.out.println("\n");
		System.out.println("Roll Number :"+s2.rollNumber+"\n"+"Name :"+s2.name+"\n"+"College :"+Student.collegeName);
		System.out.println("\n");
		System.out.println("Roll Number :"+s3.rollNumber+"\n"+"Name :"+s3.name+"\n"+"College :"+Student.collegeName);*/
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		
		/*6.Call the static method using the class name instead of an object reference.*/
		Student.displayStudentCount();//displaystudentcount is a static 
	}

}
