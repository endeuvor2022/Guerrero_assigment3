package guerrero_p3;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	static int total;
	static  int inputUser;
	static int number1, number2;
	static Scanner input = new Scanner(System.in);
	
	
	
	public void quiz() 
	{
		//CAI1 total = new CAI1();
		//CAI1 result = new CAI1();
//		total.askQuestion();
//		total.readResponse();
//		total.isAsnwerCorrect();
		askQuestion();
		readResponse();
	    isAsnwerCorrect();
		
	}
	
	public void askQuestion() 
	{
		SecureRandom ramdon1 = new SecureRandom();
		
		number1    =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("how much is %d ",    number1);    //    display    generated    value
            
        number2   =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("time %d        ", number2   ); 
        System.out.println(  ) ;//    display    generated    value
     }
	
	
	public int readResponse()
	{
		
		System.out.println("please enter your answer ");
		inputUser = input.nextInt();
		
		return inputUser;
	}
	
	public void  isAsnwerCorrect()
	{
		  total = number1*number2;
	      System.out.println(total);
		  
	      while (total!=inputUser)
		  {
			displaynoCorrectResponse();// call a method 
			
		  }
		     
	      displayCorrectResponse() ;//call method
	
		
		
	}
	 
	public void displayCorrectResponse() 
	{
		 System.out.println("Very good");
	}
	
	public void displaynoCorrectResponse() 
	{	
		System.out.println("No, please try again");
		System.out.printf("how much is %d ",    number1);    
        System.out.printf("time %d        ", number2   ); 
        System.out.println(  ) ;
        readResponse();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI1 total = new CAI1();
	    total.quiz();

	}

}
