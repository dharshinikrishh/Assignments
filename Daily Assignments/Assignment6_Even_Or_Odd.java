package dailyassignments;

public class Assignment6_Even_Or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to check whether the given number 15 is even or odd.
			Sample Output:
			The number is odd.*/
		int num=15;
		if(num % 2==0)//% to find the reminder if the reminder is 0 then it'll be consider as even
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");		
	}

}
