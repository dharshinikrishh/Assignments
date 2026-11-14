package weeklyassignments;
//1.	Create a BankAccount class with:
//o	accountHolder
//o	balance

class BankAccount
{
	String accountHolder;
	double balance;
	BankAccount(String accountHolder, double balance){
		this.accountHolder=accountHolder;
		this.balance=balance;
	}

	//2.	Create a method withdraw(double amount).
   void withdraw(double amount) throws Exception
	{
	   //3.	If the withdrawal amount is greater than the available balance, handle the exception.
		if(amount>balance)
		{
			throw new Exception("Insufficient Balance");
		}
		//4.	If the user enters a negative withdrawal amount, handle the invalid input.
		if(amount<0)
		{
			throw new Exception("Negative Withdrawal Amount");
		}
		//This statement executes only when both conditions are false.
		balance = balance - amount;
        
	}
}
public class Assignment18_BankAccountWithdrawalUsingException {

	public static void main(String[] args) {
		
		 BankAccount ba = new BankAccount("Rahul", 10000);
	     double amount = 15000;
	     System.out.println("Account Holder: " + ba.accountHolder);
	     System.out.println("Current Balance: " + ba.balance);
	     System.out.println("Withdrawal Amount: " + amount);

	     try {
	            ba.withdraw(amount);
	            System.out.println("Remaining Balance: " + ba.balance);
	        }
	        catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	        finally {
	            System.out.println("Transaction process completed");
	        }
	}

}
