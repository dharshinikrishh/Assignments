package dailyassignments;

public class Assignment9_MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=172;
		int sum=0;
		System.out.println("Enter a Number:"+num);
		for(;num>9;)
		{
			for(;num>0;)
			{
				int lastDigit=num%10;//172/10=reminder(2)
				sum=sum+lastDigit;//1+7+2=10
				num=num/10;
			}
			num=sum;//10
			sum=0;
			
		}
		System.out.println("Final Digit:"+num);
		if(num==1)
			System.out.println("Magic Number");
		
	}

}
