package dailyassignments;

public class Assignment3_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit casting-bcz char-2 bytes, int has 4 bytes
		//upcasting.
		
		/*Write a Java program to print the ASCII value of the following characters:
				•	A 
				•	a 
				•	0 
				•	@ 
			Expected Output:
			ASCII value of A = 65
			ASCII value of a = 97
			ASCII value of 0 = 48
			ASCII value of @ = 64*/

		char value='A';
		int num=value;
		System.out.println("ASCII value of A="+num);
		
		char value1='a';
		int num1=value1;
		System.out.println("ASCII value of a="+num1);
		
		char value2='0';
		int num2=value2;
		System.out.println("ASCII value of 0="+num2);
		
		char value3='@';
		int num3=value3;
		System.out.println("ASCII value of @="+num3);
		
	}

}
