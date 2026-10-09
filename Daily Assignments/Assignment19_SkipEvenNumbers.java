package dailyassignments;

public class Assignment19_SkipEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2. Skip Even Numbers
				Write a Java program to print numbers from 1 to 20 using a do-while loop.
				Requirements:
				- Use continue to skip all even numbers.
				- Print only odd numbers.
				- Use break to stop the loop when the number becomes greater than 15.
				Expected Output:
				1 3 5 7 9 11 13 15*/
				int num=0;
				do
				{
					num++;
					if(num%2==0)
						continue;
					if(num>15)
						break;
					System.out.println(num+" ");
					
				}while(num<=20);
			}

}
