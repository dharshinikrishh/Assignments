package weeklyassignments;

public class Assignment5_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int count=0;
		int sum=0;
		for (;num>0;)
		{
			count++;
			num=num/10;	
		}
		System.out.println(count);
		num=temp;
		for(;num>0;)
		{
		int lastdigit=num%10;
		sum=sum+(int) Math.pow(lastdigit, count);
		num=num/10;
		}
		if (temp==sum)
			System.out.println("Armstrong Number:"+sum);
		else
			System.out.println("Not Armstrong Number:"+sum);
	}

}
