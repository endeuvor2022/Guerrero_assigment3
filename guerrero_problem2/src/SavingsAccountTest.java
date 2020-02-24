package proffesor01;

import java.text.DecimalFormat;

//Write a program called SavingsAccountTest to test class SavingsAccount. 
//Instantiate two SavingsAccount objects, 
//saver1 and saver2, with balances of $2000.00 and $3000.00, 
//respectively. Set annualInterestRate to 4%, 
//then calculate the monthly interest for each of 12 months and print the monthly balances 
//for both savers. Next, set the annualInterestRate to 5%, 
//calculate the next month’s interest and print the new balances for both savers.
////private variables instance variables
public class SavingsAccountTest {

	//decimalformat method help me to print only two decimal
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) 
	{
		
		// instantiate two object from SavingAccount
		SavingAccount 
		saver1 ,saver2;
		
		//balances
		saver1 = new SavingAccount(2000.00);
		saver2 = new SavingAccount(3000.00);
		
		//set interest 
		SavingAccount.modifyInterestRate(4);
		int month=0;
		//calculate interest rate for the 12 months
		System.out.println(" Month    \tBank Account 1\tBank Account 2");
		do
		{	
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("");
		month++;
		System.out.print(month);
		System.out.print("\t\t"+df2.format(saver1.getsavingBalance()));
		System.out.print("\t\t"+df2.format(saver2.getsavingBalance()));
		}
		while(month<12);
		
		//space
		System.out.println();
		//rate 5
		double rate =5;
		SavingAccount.modifyInterestRate(rate);
		
		// calculate the next month interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// print
		System.out.println("Current Month\tinterestrate\t\tBank Account 1\t\tBank Account 2");
		System.out.print(month);
		System.out.print("\t\t"+rate);
		System.out.print("\t\t\t"+df2.format(saver1.getsavingBalance()));
		System.out.print("\t\t\t"+df2.format(saver2.getsavingBalance()));

	}

}
