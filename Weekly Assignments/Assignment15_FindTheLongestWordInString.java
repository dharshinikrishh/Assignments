package weeklyassignments;

import java.util.Scanner;

public class Assignment15_FindTheLongestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q2. Find the Longest Word
			Write a Java program to find the longest word in a given sentence.
			Example:
			Input: Java programming is interesting
			Output: programming*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		String str1=sc.nextLine();
		String [] words=str1.split(" ");
		String longestWord="";
			for(int i=0;i<words.length;i++)
			{
				
				if(words[i].length()>longestWord.length())//checking length>maxlength= 4>0-true
					longestWord=words[i];//contains "Java".Therefore, longestWord = "Java".
			}
			System.out.println("Output :"+longestWord);
	}
	}

