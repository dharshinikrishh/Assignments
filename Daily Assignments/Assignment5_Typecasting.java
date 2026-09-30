package dailyassignments;

public class Assignment5_Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forcefully changing the value
		//downcasting big data type to small datatype
		
		/*Create a Java program that:
		1.	Stores 10.75 in a double variable. 
		2.	Explicitly typecasts it to an int variable. 
		3.	Prints both values.*/


		double variable=10.75;
		int variable1=(int)variable;
		System.out.println("double value:"+variable);
		System.out.println("Typecast int to an int variable:"+variable1);
	}

}
