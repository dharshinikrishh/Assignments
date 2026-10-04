package weeklyassignments;

public class Assignment8_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a given number is a palindrome using a loop.
Input:
1221
Expected Output:
1221 is a palindrome*/
		int num=1221;
		int temp=num;
		int reverse=0;
		for (;num>0;)
		{
			int digit=num%10;//1
			reverse=digit+reverse*10;
			num=num/10;
		}
		System.out.println(reverse);
		if(reverse==temp)
		{
			System.out.println("The number is palindrome: "+ reverse);
		}
		else
			System.out.println("The number is not palindrome: "+ reverse);
	}

}
