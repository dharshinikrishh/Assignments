package weeklyassignments;

public class Assignment10_CommonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
					Write a Java program to find the common elements between two integer arrays. Print each common element only once.
					Input:
					Array 1: {10, 20, 30, 40, 50}
					Array 2: {30, 40, 60, 70, 50}
					
					Expected Output:
					Common elements: 30 40 50*/
			int[]arr1= {10,20,30,40,50};
			int[]arr2= {30,40,60,70,50};
			System.out.print("Common Elements: ");
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)//element 0 vlaue=10
				{
					if(arr1[i]==arr2[j])
					{
						System.out.print(arr1[i]+" ");
						break;
					}
	
				}
			}
		
	}

}
