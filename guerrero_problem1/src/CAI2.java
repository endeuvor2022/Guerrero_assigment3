package guerrero_p3;

import java.security.SecureRandom;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class CAI2 {
	int total;
	int userInput;
	int number1, number2;
	Scanner input = new Scanner(System.in);
	static Random rand = new Random(); 
	
	 CAI2()
	 {
		 
		 this.userInput = 0 ;
		 this.number1 = 0;
		 this.number2 = 0;
		 this.total = 0;
		  
	 }

	public void quiz() 
	{
		CAI2 total = new CAI2();
		//CAI1 result = new CAI1();
		total.askQuestion();
		total.readResponse();
		total.isAsnwerCorrect();
		
	}
	
	public void askQuestion() 
	{
		SecureRandom ramdon1 = new SecureRandom();
		
		this.number1    =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("how much is %d ",    this.number1);    //    display    generated    value
            
        this.number2   =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("time %d        ", this.number2   );    //    display    generated    value
        System.out.println(  ) ;
     }
	
	
	public int readResponse()
	{
		
		System.out.println("please enter your answer ");
		this.userInput = input.nextInt();
		
		return this.userInput;
	}
	
	public void  isAsnwerCorrect()
	{
		  this.total = this.number1*this.number2;
	    //  System.out.println(this.total);
		  
	      while (this.total!=this.userInput)
		  {
			displaynoCorrectResponse();// call a method 
			
		  }
		     
	      displayCorrectResponse() ;//call method
	
		
		
	}
	 
	public void displayCorrectResponse() 
	{
		int rand_int1 = 1+rand.nextInt(4); 
		//System.out.println(rand_int1);
		switch(rand_int1)
		{
		case 1:
			System.out.println("Very good");
			break;
		case 2:
			System.out.println("Excellent");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work");
			break;
			
		}
		
		
	}
	
	public void displaynoCorrectResponse() 
	{	
		
		
		
		
		int rand_int2 = 1+rand.nextInt(4); 
		switch(rand_int2)
		{
		case 1:
			System.out.println("No, Please try again ");
			break;
		case 2:
			System.out.println("Wrong. try once more");
			break;
		case 3:
			System.out.println("Dont't give up!");
			break;
		case 4:
			System.out.println("No. Keep trying");
			break;
			
		}
        
		System.out.printf("how much is %d ",    this.number1);    
        
		
		
		System.out.printf("time %d        ", this.number2   ); 
		System.out.println(  ) ;
		readResponse();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI2 total = new CAI2();
	    total.quiz();

	}

}

