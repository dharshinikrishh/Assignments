package weeklyassignments;


public class Assignment14_CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q1. Count Vowels and Consonants
				Write a Java program to count the total number of vowels and consonants in a given string.
				Example:
				Input:  Programming
				Output:
				Vowels: 3
				Consonants: 8*/
		String str="Programming";
		//String[]words=str.split("");//we are spliting this word using the "" and storing it in the words.
		str=str.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<str.length();i++)//words length-11, the index is 10
		{
			char ch=str.charAt(i);
			if((ch=='a'|| ch=='i'||ch=='e'|| ch=='o'|| ch=='u'))
			{
				vowels++;
			}
			else
				consonants++;
		}
		System.out.println("Vowels :"+vowels);
		System.out.println("Consonants :"+consonants);
			

	}

}
