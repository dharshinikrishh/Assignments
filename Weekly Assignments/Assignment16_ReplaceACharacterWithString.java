package weeklyassignments;

import java.util.Scanner;

public class Assignment16_ReplaceACharacterWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		/*Q3) Replace a Character in a String
			Write a Java program to replace all occurrences of a particular character with another character without using the replace() method.
			Example:
			Input:
			String: banana
			Old Character: a
			New Character: o
			*/
		Scanner sc=new Scanner(System.in);
		System.out.println("String:");
		String str=sc.nextLine();//getting the input from the user
		
		System.out.println("Old Character:");//getting the input from the user
        String oldChar = sc.nextLine();

        System.out.println("New Character:");
        String newChar = sc.nextLine();//getting the input from the user
        
		String[]words=str.split("");//spliting the word in the basis of quotation"", and storing it in the array
		String replace="";//we need an empty string to store the output words={"b","a","n","a","n","a"}
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(oldChar))//checking each word with the old char which is a
			{
				  replace = replace + newChar;//replace is currently= empty+that new char
			}
			else
				replace = replace + words[i];//if the condition false this will execute.
		}
		System.out.println(replace);
		
	}

}
