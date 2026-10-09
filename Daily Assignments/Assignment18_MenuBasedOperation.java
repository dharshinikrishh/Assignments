package dailyassignments;

public class Assignment18_MenuBasedOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1. Menu-Based Operation
				Write a Java program where the following variables are already given:
				int choice = 3;
				int a = 20;
				int b = 5;
				
				Use a do-while loop and switch-case to perform the operation based on choice.
				- 1 â†’ Addition
				- 2 â†’ Subtraction
				- 3 â†’ Multiplication
				- 4 â†’ Division
				- 5 â†’ Exit
				- Use break after executing each case.
				- The loop should continue until choice becomes 5.
				Expected Output:
				Multiplication = 100 */
		
				int choice=3;
				int a=20;
				int b=5;		
				do
				{
					switch(choice)
					{
					case 1: System.out.println("Addition = "+(a+b));
					break;
					case 2: System.out.println("Subtraaction ="+(a-b));
					break;
					case 3: System.out.println("Multiplication = "+(a*b));
					break;//it's used to come out of the loop.
					case 4: System.out.println("Division = "+(a/b));
					break;
					case 5: System.out.println("Exit");
					break;
					default : System.out.println("Invalid number");
					break;
					
					}
					choice++;
					break;
				}while(choice<=5);
				
			}
		
		}
