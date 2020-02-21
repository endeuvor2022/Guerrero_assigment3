package guerrero_p3;

import java.security.SecureRandom;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {
	int total;
	int userInput;
	int number1, number2;
	int correctAnwers;
	int wrongAnwers;
	double correctPorcentage;
	double incorrectPorcentage;
	double TOTAL_QUESTION ;
	Scanner input = new Scanner(System.in);
	static Random rand = new Random(); 
	
	 CAI3()
	 {
		 
		 this.userInput = 0 ;
		 this.number1 = 0;
		 this.number2 = 0;
		 this.total = 0;
		  
	 }

	public void quiz() 
	{
		
		
		// loop for 10 question
		for (int i =0; i<10; i++)
		{
		askQuestion();
		readResponse();
		isAsnwerCorrect();
	    }
		
		displayCompletionMessage();
		
	}
	
	public void askQuestion() 
	{
		int  compare1 =0;
		int  compare2 =0;
		 //      generated   random value
		SecureRandom ramdon1 = new SecureRandom();
		this.number1    =    1    +    ramdon1.nextInt(9); 
		this.number2   =    1    +    ramdon1.nextInt(9); 
		  
		//if statement avoid generated equal random number
		if ( (compare1!=this.number1)&&(compare2!=this.number2))
		{
		    
		    System.out.printf("how much is %d ",    number1);
			System.out.printf("time %d        ", number2   );    
			System.out.println(  ) ;
	    }
		/// generate new random numbers
		else 
	    {
//		    display    generated    value
			this.number1    =    1    +    ramdon1.nextInt(9); 
		    this.number2   =    1    +    ramdon1.nextInt(9);
		    System.out.printf("how much is %d ",    number1);
		    System.out.printf("time %d        ", number2   );    
		    System.out.println(  ) ;
		}
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
	    
		  
	      if (this.total!=this.userInput)
		  {
	    	System.out.println("the correct answer is:"+this.total);
			displaynoCorrectResponse();// call a method 
			
		  }
		     
	      else displayCorrectResponse() ;//call method
	
	}
	 
	public void displayCorrectResponse() 
	{
		correctAnwers++; // counter how many good answers
		
		int rand_int1 = 1+rand.nextInt(4); 
		
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
		
		wrongAnwers++; // counter how many bad answers
		
		
		
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
		
	}
	public void displayCompletionMessage()
	{
		//percentage calculation
		
		correctPorcentage = ((double)correctAnwers*100)/10.00;
		incorrectPorcentage = ((double)wrongAnwers*100)/10.00;
		
		// filter the percentage for the right answer 
		if (correctPorcentage>=75 )
		{
			System.out.println("Congratulations, you are ready to go to the next level!"+correctPorcentage);
		}
		else
		{
			System.out.println("Please ask your teacher for extra help."+(100-incorrectPorcentage));
		}
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI3 total = new CAI3();
	    total.quiz();

	}

}

