package dailyassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment31_RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(50);
		al.add(30);
		System.out.println("Input :"+al);
		Set<Integer>set=new LinkedHashSet<Integer>(al);
		/*set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(50);
		set.add(30);*/
		System.out.println("Unique Elements :"+set);
		System.out.println("Total Unique Element:"+set.size());
		/*int num=0;
		for(Integer s:set)
		{
			num++;
		}
		System.out.println("Total Unique Elements:"+num);*/
	}

}
