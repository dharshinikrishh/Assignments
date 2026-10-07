package dailyassignments;

public class Assignment8_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		int sum=0;
		int productOfDigits=1;
		//int originalNum=num;
		int displayNum=num;
		System.out.println("Enter a Number:"+num);
		for (;num>0;)//checking till the number is greater than 0
		{
			int lastDigit=num%10;//1124/10=reminder(4)
			sum=sum+lastDigit;
			productOfDigits=productOfDigits*lastDigit;
			num=num/10;
		}
		System.out.println("Sum of Digits:"+sum);
		/*for(;originalNum>0;)
		{
			int lastDigit=originalNum%10;//reminder
			productOfDigits=productOfDigits*lastDigit;//we are making the productOfDigits as 1 so anything multiple by 
			originalNum=originalNum/10;//quotient
		}*/
		System.out.println("Product of Digits:"+productOfDigits);
		if(sum==productOfDigits)
			System.out.println(displayNum+" is a SPY Number");
		else
			System.out.println(displayNum+" is a not SPY Number");
	}

}
