package weeklyassignments;

public class Assignment12_FindTheSecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Q1. Find the Second Largest Element
				Write a Java program to find the **second largest distinct element** in an integer array.
				
				**Input:**
				`{12, 45, 7, 89, 34, 89, 56}`*/
		int[]arr= {99,99,12,45,7,89,34,89,56};
		System.out.println("min value:"+Integer.MIN_VALUE);
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("Largest:"+largest);
		System.out.println("Second Largest :"+secondLargest);
	}

}
