package dailyassignments;

public class Assignment20_CountEvenAndOddUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q1. Count Even and Odd Numbers

		rite a Java program to count how many even and odd numbers are present in an integer array.

		Input:
		{11, 24, 35, 42, 56, 67, 80, 93}
		
		Expected Output:
		Even numbers: 4
		Odd numbers: 4*/
		
		int eveCount=0;
		int oddCount=0;
		int [] num= {11,24,35,42,56,67,80,93};
		for(int index=0;index<num.length;index++)
		{
	
			if(num[index]%2==0)
				eveCount++;
			else
				oddCount++;
		}
		System.out.println("Odd Numbers count:"+oddCount);
		System.out.println("Even Numbers count:"+eveCount);
	}

}
