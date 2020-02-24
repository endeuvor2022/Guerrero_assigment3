package proffesor01;

public class SavingAccount {
//	Create class SavingsAccount. 
//	Use a static variable annualInterestRate to store the annual interest rate 
//	for all account holders. 
//	Each object of the class contains a private instance variable 
//	savingsBalance indicating the amount the saver currently has on deposit. 
//	Provide method calculateMonthlyInterest to calculate the monthly interest 
//	by multiplying the savingsBalance by annualInterestRate divided by 12—this 
//	interest should be added to savingsBalance. Provide a static method modifyInterestRate 
//	that sets the annualInterestRate to a new value.
//

	private static double annualInteresRate;
	private double savingsBalance;
	
	//constructor
	SavingAccount(double savingsBalance)
	{
		 this.savingsBalance= savingsBalance;
	}
	
	//get method for a private field 
	public double getsavingBalance()
	
	{
		return this.savingsBalance;
	}
	//method the calculate the monthly interest
	public double calculateMonthlyInterest()
	{
		 double monthlyInterest = (this.savingsBalance * annualInteresRate) / 12;
	        this.savingsBalance = this.savingsBalance + monthlyInterest;
	        return monthlyInterest;
	}
	//modify the interest rate
	public static void modifyInterestRate(double interestRate)
	{
		annualInteresRate = interestRate/100;
		
	}
	
	
	
	
	
	

}
