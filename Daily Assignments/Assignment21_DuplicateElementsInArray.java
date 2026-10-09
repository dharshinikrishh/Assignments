package dailyassignments;

public class Assignment21_DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q2. Find Duplicate Elements

			Write a Java program to identify and print all duplicate elements in an array. Each duplicate element should be printed only once.
			
			Input:
			{10, 20, 30, 20, 40, 10, 50, 30, 60}
			
			Expected Output:
			Duplicate elements: 10 20 30*/
		
		int []elements= {10,20,30,20,40,10,50,30,60};
		System.out.print("Duplicate Elements: ");
		for(int index=0;index<elements.length;index++)
		{
			for (int j = index + 1; j < elements.length; j++)
			{
				if (elements[index] == elements[j])
					 System.out.print(elements[index] + " ");
			}
			
			
		
	}

}
}
