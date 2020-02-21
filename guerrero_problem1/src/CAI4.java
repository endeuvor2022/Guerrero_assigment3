package guerrero_p3;

import java.security.SecureRandom;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class CAI4 {
	int total;
	int userInput;
	int selectLevel;
	int number1, number2, number3;
	int correctAnwers;
	int wrongAnwers;
	double correctPorcentage;
	double incorrectPorcentage;
	double TOTAL_QUESTION ;
	Scanner input = new Scanner(System.in);
	Random rand = new Random(); 
	
	 CAI4()
	 {
		 
		 this.userInput = 0 ;
		 this.number1 = 0;
		 this.number2 = 0;
		 this.number3 = 0;
		 this.total = 0;
		 this.selectLevel=0;
	 }

	public void quiz() 
	{
		readDifficulty();
		generateQuestionArgument();	
		askQuestion();
		displayCompletionMessage();
	}
	
	public void readDifficulty()
	{
		//The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
		System.out.println("PLease choice difficult level");
	    System.out.println('\t'+"1)level one");    
	    System.out.println('\t'+"2)level two");
	    System.out.println('\t'+"3)level three");   
	    System.out.println('\t'+"4)level four");   
	    this.selectLevel = input.nextInt();
	    input.nextLine();
	}
	
	public void generateQuestionArgument()
	{
		switch(this.selectLevel)
		{
		case 1:
			this.number1    =   1   +   rand.nextInt(9); 
			this.number2   =    1   +   rand.nextInt(9);
			break;
		
		case 2:
			this.number1   =    1    +    rand.nextInt(99); 
			this.number2   =    1    +    rand.nextInt(99); 
			break;
		
		case 3:
			this.number1   =    1    +    rand.nextInt(999); 
			this.number2   =    1    +    rand.nextInt(999); 
			break;
		
		case 4:
			this.number1   =    1    +    rand.nextInt(9999); 
			this.number2   =    1    +    rand.nextInt(9999); 
			break;
			
		}
		
		
	}	
	
	public void askQuestion() 
	{
		int  compare1 =0;
		int  compare2 =0;
		
	   
    	
	    	for (int i =0; i<10; i++)
	    	{
	    		//avoid generate same random numbers
	    		if(compare1!=this.number1&&compare2!=this.number2)
	    		{
	    			System.out.printf("how much is %d ",    this.number1);
	    			System.out.printf("time %d        ", this.number2   );    
	    			compare1 = this.number1;
	    			compare2 = this.number2; 
	    			System.out.println();	
	    			readResponse();
	    			isAsnwerCorrect();
	    			generateQuestionArgument();
	    		}
	    		else
	    		{
	    			generateQuestionArgument();
	    			
	    		}
			
	    	}
		
		
 
	}
	

	public int readResponse()
	{
		
		System.out.println("please enter your answer ");
		this.userInput = input.nextInt();
		input.nextLine();
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
		
		wrongAnwers++; // counter how many bad answers
		
		//System.out.println("No, please try again");
		
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
			System.out.println("Please ask your teacher for extra help."+incorrectPorcentage);
		}
		
		// ask the user if they want continue
		System.out.println("Do you want continue to solve another set  ");
	    System.out.println('\t'+"1)yes" );    
	    System.out.println('\t'+"2)no " ) ;
	    this.number3 = input.nextInt();
	    input.nextLine();
	    switch(this.number3)
		{
		case 1:
			quiz();
			break;
		case 2:
			System.out.println("until the next time");
			break;
		
		}
	    
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI4 total = new CAI4();
	    total.quiz();

	}

}



