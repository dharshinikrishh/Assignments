package weeklyassignments;

public class Assignment12_MoveAllZerosToTheEndUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//using the same logic for even and odd programs.
		/*Q2. Move All Zeros to the End
			Write a Java program to move all zeros to the end of an array while maintaining the relative order of the non-zero elements.
			
			**Input:**
			{0, 5, 0, 3, 8, 0, 2, 9}`
			
			**Expected Output:**
			`Array after moving zeros: 5 3 8 2 9 0 0 0`*/
		/*int[]num= {0,5,0,3,8,0,2,9};
		System.out.print("Array after moving zeros: ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0)
				System.out.print(num[i]+" ");
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==0)
			System.out.print(num[i]+" ");
		}*/
		int []arr= {0,5,0,3,8,0,2,9};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==0) 
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
					else
						j++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
