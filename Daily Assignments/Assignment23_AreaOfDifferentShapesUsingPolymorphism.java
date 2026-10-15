package dailyassignments;

public class Assignment23_AreaOfDifferentShapesUsingPolymorphism {
	/*Question : Calculate the Area of Different Shapes
			Write a Java program to demonstrate polymorphism 
			Requirements:
			
			1. Overload the calculateArea(int radius) method for circle 
			2. Overload the calculateArea(int length,int breadth) method for rectangle 
			Formulas:
			- Circle: Area = 3.14 Ã— radius Ã— radius
			- Rectangle: Area = length Ã— breadth*/
	static float calculateArea(int radius)
	{
		return  3.14f* (radius * radius);
	}
	static double calculateArea(int length, int breadth)

	{
		return length * breadth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle : " +calculateArea(5));
		System.out.println("Area of Rectangle :"+calculateArea(8,4));
	}

}
