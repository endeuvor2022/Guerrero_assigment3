package guerrero_p3;

import java.security.SecureRandom;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;
//Requirements
//The program shall generate random numbers with a SecureRandom object
//The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
//A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
//A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
//A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
//A difficulty level of 4 shall limit random numbers to the range of 0-9999, inclusive
//The program shall ask the student to enter a problem type of 1, 2, 3, 4, or 5 with an appropriate human-readable label
//The program shall ask the student to solve 10 different problems, as determined by the problem type
//A problem type of 1 shall limit the program to generating only addition problems
//A problem type of 2 shall limit the program to generating only multiplication problems
//A problem type of 3 shall limit the program to generating only subtraction problems
//A problem type of 4 shall limit the program to generating only division problems
//A problem type of 5 shall result questions that are a randomly mixture of addition, multiplication, subtraction, and division problems
//Problems shall contain two numbers sampled from a uniform random distribution with bounds determined by the problem difficulty
//The program shall display a random positive message if the student provides a correct response
//The program shall display a random negative message if the student provides an incorrect response
//The program shall display the student's score after the student has attempted to solve 10 problems
//The student's score shall be the percentage of problems correctly solved
//The program shall display the message "Please ask your teacher for extra help." if the student's score is less than 75%
//The program shall display the message "Congratulations, you are ready to go to the next level!" if the student's score is greater than or equal to 75%
//The program shall ask the student if they want to solve a new problem set after the score message has been displayed
//The program shall restart when the student agrees to solve a new problem set
//The program shall terminate when the student declines to solve another problem set
//Create a method called "quiz" that contains the program logic
//Create a method called "readDifficulty" that reads the difficulty level from the student
//Create a method called "readProblemType" that reads the difficulty level from the student
//Create a method called "generateQuestionArgument" that uses the difficulty level to generate a random number
//Create a method called "askQuestion" that prints the problem to the screen
//Create a method called "readResponse" that reads the answer from the student
//Create a method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
//Create a method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
//Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
//Create a method called "displayCompletionMessage" that prints out the studen't score and appropriate score response
//Create a main method that runs your program by calling the "quiz" method
 
public class CAI5 {
	double total;
	double userInput;
	int selectLevel;
	int selectType;
	int number1, number2, number3;
	int correctAnwers;
	int wrongAnwers;
	double correctPorcentage;
	double incorrectPorcentage;
	double TOTAL_QUESTION ;
	Scanner input = new Scanner(System.in);
	Random rand = new Random(); 
	
	 CAI5()
	 {
		 
		 this.userInput = 0 ;
		 this.number1 = 0;
		 this.number2 = 0;
		 this.number3 = 0;
		 this.total = 0;
		 this.selectLevel=0;
		 this.selectType = 0;
	 }

	public void quiz() 
	{
		
		readDifficulty();
		readProblemType ();
		generateQuestionArgument();	
		askQuestion();
		displayCompletionMessage();
		
		
	}
	
	public void readDifficulty()
	{
		//The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
		System.out.println("PLease choice difficult level");
	    System.out.println('\t'+"1)level one (0-9)");    
	    System.out.println('\t'+"2)level two (0-99");
	    System.out.println('\t'+"3)level three (0-999)");   
	    System.out.println('\t'+"4)level four (0-999)");   
	    this.selectLevel = input.nextInt();
	    input.nextLine();
		//return selectLevel;
	}
	
	public void readProblemType ()
	{
		System.out.println("PLease choice difficult level");
	    System.out.println('\t'+"1)addition");    
	    System.out.println('\t'+"2)substraction");
	    System.out.println('\t'+"3)multiplication");   
	    System.out.println('\t'+"4)division"); 
	    System.out.println('\t'+"5)mix problems"); 
	    this.selectType = input.nextInt();
	    input.nextLine();
	}
	
	
	
	public void generateQuestionArgument()
	{
		int  swap =0;
//	    int  compare2 =0;
		switch(this.selectLevel)
		{
			case 1:
				this.number1    =   1   +   rand.nextInt(9); 
				this.number2   =    1   +   rand.nextInt(9);
				;
			break;
			
			case 2:
				this.number1   =    1    +    rand.nextInt(99); 
				this.number2   =    1    +    rand.nextInt(99); 
				swapNumber();
			break;
		
			case 3:
				this.number1   =    1    +    rand.nextInt(999); 
				this.number2   =    1    +    rand.nextInt(999); 
				swapNumber();
			break;
		
			case 4:
				this.number1   =    1    +    rand.nextInt(9999); 
				this.number2   =    1    +    rand.nextInt(9999);
				swapNumber();
			break;
			
		}
		
		
		
	}	
	
	public void askQuestion() 
	{
		int  counter =0;
		int  compare1 =0;
		int  compare2 =0;
		
	   // loop generate 10 question
		for (int i =0; i<10; i++)
		{
			
		// compare if the numbers are different 
	   if(compare1!=this.number1&&compare2!=this.number2)
		{	
	   
		   switch(this.selectType)
		   {
		   case 1:
			    System.out.println("addition problem");
			    System.out.printf("how much is %d ",    this.number1);
			    System.out.printf("+ %d        ", this.number2   );   
			    readResponse();
    			isAsnwerCorrect();
    			generateQuestionArgument();
			    break;
		
		   case 2:
			   	swapNumber();
				System.out.println("substraction problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("- %d        ", this.number2   );   
				readResponse();
    			isAsnwerCorrect();
    			generateQuestionArgument();
				break;
		
		   case 3:
				System.out.println("multiplication problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("* %d        ", this.number2   );  
				readResponse();
    			isAsnwerCorrect();
    			generateQuestionArgument();
				break;
		
		   case 4:
			   	swapNumber();
				System.out.println("division problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("/ %d        ", this.number2   ); 
				readResponse();
    			isAsnwerCorrect();
    			generateQuestionArgument();
				break;
				
		   case 5:
			   selectionFive();
			   
			   break;
			
		   }
		}
	   // generate different random numbers 
	   else 
	   {
		   generateQuestionArgument();
	   }
		   
	   }
	   
	}
	
	// method generate random question for selection number 5 
	public void selectionFive()
	{
		// loop 10 times 
		for (int i =0; i<10;i++)
		{
			// generate random numbers
		   int rand_int3 = 1+rand.nextInt(4); 
		   // passing the random number to this.selectType 
		   this.selectType = rand_int3;
		  // switch statement for every case
		   switch(this.selectType)
		   {
		   case 1:
			    System.out.println("addition problem");
			    System.out.printf("how much is %d ",    this.number1);
			    System.out.printf("+ %d        ", this.number2   );   
			    readResponse();
	   			isAsnwerCorrect();
	   			generateQuestionArgument();
			    break;
		
		   case 2:
			   	swapNumber();
				System.out.println("substraction problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("- %d        ", this.number2   );   
				readResponse();
	   			isAsnwerCorrect();
	   			generateQuestionArgument();
				break;
		
		   case 3:
				System.out.println("multiplication problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("* %d        ", this.number2   );  
				readResponse();
	   			isAsnwerCorrect();
	   			generateQuestionArgument();
				break;
		
		   case 4:
			   	swapNumber();
				System.out.println("division problem");
				System.out.printf("how much is %d ",    this.number1);
				System.out.printf("/ %d        ", this.number2   ); 
			    readResponse();
	   			isAsnwerCorrect();
	   			generateQuestionArgument();
				break;
			
		   }  
		}
	  }

	

	public double readResponse()
	{
		
		System.out.println("please enter your answer ");
		this.userInput = input.nextDouble();
		input.nextLine();
		return this.userInput;
	}
	
	
	public void  isAsnwerCorrect()
	{
		switch(this.selectType)
		{
		case 1:
			this.total = this.number1+this.number2;
				if (this.total!=this.userInput)
				{
					displaynoCorrectResponse();// call a method 
				}
				else displayCorrectResponse() ;//call method  
			break;
		
		case 2:
			this.total = this.number1-this.number2;
				if (this.total!=this.userInput)
				{
					displaynoCorrectResponse();// call a method 
				
				}
			    else displayCorrectResponse() ;//call method  
				break; 
				
		case 3:
			this.total = this.number1*this.number2;
				if (this.total!=this.userInput)
				{
					displaynoCorrectResponse();// call a method 
				}
			    else displayCorrectResponse() ;//call method  
				break;
		
		case 4:
			swapNumber();
			division() ;
			

//			float this.total = (float) this.number1/this.number2;
//				if ((float) this.total!=(float)this.userInput)
//				{
//					displaynoCorrectResponse();// call a method 
//				
//				}
//			    else displayCorrectResponse() ;//call method  
				break;
		
		}
		
	}
	 
	
	public void displayCorrectResponse() 
	{
		correctAnwers++; // counter how many good answers
		//random number generator
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
		// random number generator
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
		
		// filter the percentage above 75
		if (correctPorcentage>=75 )
		{
			System.out.println("your final score is: "+correctPorcentage);
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else
		{
			System.out.println("your final score is: "+(100-incorrectPorcentage));
			System.out.println("Please ask your teacher for extra help.");
		}
		
		// ask the user if they want continue
		System.out.println("Do you want continue to solve another set  ");
	    System.out.println('\t'+"1)yes" );    
	    System.out.println('\t'+"2)no " ) ;
	    this.number3 = input.nextInt();
	    input.nextLine();
	    
	    // switch statement process the input user
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
	
	//  method the swap the lower number position with the bigger number
	public void swapNumber() 
	{
		int swap =0;
			if (this.number1<this.number2)
			{	
			swap=this.number1;
			this.number1=this.number2;
			this.number2 = swap;
			}
	}
	
	public void division() 
	{
		swapNumber();
		 this.total =  (double) this.number1/this.number2;
		System.out.println(this.total);
		 if ( this.total!=this.userInput)
		{
			displaynoCorrectResponse();// call a method 
		
		}
	    else displayCorrectResponse() ;//call method 
		
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		CAI5 total = new CAI5();
	    total.quiz();

	}

}




