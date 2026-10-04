package weeklyassignments;

public class Assignment7_SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find the sum of all even numbers between 1 and 50 using a loop.
*/
		int num=50;
		int sum=0;
		for (int i=1; i<=50; i++)
				{
			if (i%2==0) {
			
				sum=i+sum;
				}
		}
		System.out.println(sum);


	}

}
