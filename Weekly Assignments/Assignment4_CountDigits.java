package weeklyassignments;

public class Assignment4_CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to count the number of digits in a given number using a while loop.
		Input:
		987654
		Expected Output:
		Number of digits = 6*/
		int num=987654;
		int digits=0;
		for (; num != 0; num = num / 10)//we are not initialize it, we are checking the number is not equal to 0
		{
            digits++;//once we have checked the number is not equal to, we are increasing the count from 0 to 1, and the loop start again.
        }

        System.out.println("Number of digits = " + digits);
				

	}

}
