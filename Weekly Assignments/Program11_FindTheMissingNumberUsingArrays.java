package weeklyassignments;

public class Program11_FindTheMissingNumberUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q3. Find the Missing Number

				Write a Java program to find the missing number in an array containing distinct numbers from 1 to 10, with one number missing.
				
				Input:
				{1, 2, 3, 5, 6, 7, 8, 9, 10}
				
				Expected Output:
				Missing number: 4*/
			int[]arr= {1,2,3,5,6,7,8,9,10};
			int total=0;
			int sum=0;
			for (int i=1;i<=10;i++)
			{
				total=total+i;
			}
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			
			int missing=total-sum;
			System.out.println("Missing number : "+missing);
			

	}

}
