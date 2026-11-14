package dailyassignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Students
{
	int rollNo;
	String name;
	String course;
	Students(int rollNo, String name, String course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	void display()
	{
		System.out.println("Student{rollNo="+rollNo+","+"name="+name+","+"Course="+course+"}");
	}
	@Override
	public int hashCode() {
		return Objects.hash(course, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name) && rollNo == other.rollNo;
	}
}
public class Assignment32_StudentManagementHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj1=new Students(101,"Rahul","Java");
		Students obj2=new Students(102,"Priya","Python");
		Students obj3=new Students(101,"Rahul","Java");
		Students obj4=new Students(103,"Amit","Java");
		Students obj5=new Students(102,"Priya","Java");
		Students obj6=new Students(101,"Rahul","Selenium");
		Set<Students>set=new LinkedHashSet<Students>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		set.add(obj6);
		System.out.println();
		for(Students s:set)
		{
			s.display();
		}
		//System.out.println(obj1.hashCode());
		//used to get the total no of students.
		System.out.println("Total Students:"+set.size());

	}

}
