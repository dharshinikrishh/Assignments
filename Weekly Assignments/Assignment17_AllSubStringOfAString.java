package weeklyassignments;

public class Assignment17_AllSubStringOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Q4)Find All Substrings of a String
			Write a Java program to print all possible non-empty substrings of a given string.
			Example:
			Input: ABC*/
		
		String str="ABC";
        for(int i=0;i<str.length();i++)
        {
        	System.out.println(str.charAt(i));
        	for(int j=i+1;j<str.length();j++)
        	{
        		System.out.println(str.substring(i,j+1));
        	}
	}
	}
}
