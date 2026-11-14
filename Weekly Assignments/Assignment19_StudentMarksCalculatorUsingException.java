package weeklyassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment19_StudentMarksCalculatorUsingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		int sum=0;
		System.out.println("Enter marks of 5 subjects:");
		for(int i=0;i<arr.length;i++)
		{
			int num=sc.nextInt();
			arr[i]=num;
			sum=sum+arr[i];
		}
		System.out.println("Total Marks:"+sum);
		//System.out.println(arr[5]);
		float average=sum/arr.length;
		System.out.println("Average Marks:"+average);
		
		}
		catch(InputMismatchException ex)
		{
		System.out.println("Invalid input! Please enter integer marks");
		}
		catch(ArrayIndexOutOfBoundsException ex )
		{
			System.out.println("Array Index Out of Bounds Exception");
		}
		finally
		{
			System.out.println("Marks calculation process completed");
		}
	}

}
