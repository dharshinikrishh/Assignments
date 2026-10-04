package weeklyassignments;

public class Assignment3_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to reverse a given number using a loop.
			Input:
			12345
			Expected Output:
			54321*/

		int num=12345;
		int reverse=0;
		for (int i=1;i<=5; i++)
		{
			int digit= num % 10;//12345%10
			reverse =reverse * 10 + digit;
			num=num/10;
		}
		System.out.print(reverse);
	}

}
