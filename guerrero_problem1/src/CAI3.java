package guerrero_p3;

import java.security.SecureRandom;
//import java.util.Random;
import java.util.Random;
import java.util.Scanner;
//Modify the program from Part 2
//to use your question generation method to ask the student 10 different questions. 
//Give students only one chance at answering each question. 
//Count the number of correct and incorrect responses typed by the student.
//After the program has asked 10 questions (and the student types 10 answers), 
//your program should calculate the percentage that are correct. 
//If the percentage is lower than 75%, display "Please ask your teacher for extra help.", 
//then reset the program so another student can try it. 
//If the percentage is 75% or higher,
//display "Congratulations, you are ready to go to the next level!", 
//then reset the program so another student can try it.
////
//
//
//Requirements
//The program shall generate random numbers with a SecureRandom object
//The program shall ask the student to solve 10 different multiplication problems
//Multiplication problems shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
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
//Create a function called "askQuestion" that prints the problem to the screen
//Create a function called "readResponse" that reads the answer from the student
//Create a function called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
//Create a function called "displayCorrectResponse" that prints out the response when a student enters a correct answer
//Create a function called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
//Create a function called "displayCompletionMessage" that prints out the studen't score and appropriate score response
//Create a main method that runs your program by calling the "quiz" method
// 
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
		//CAI3 total = new CAI3();
		
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
		 //      generated   random value
		SecureRandom ramdon1 = new SecureRandom();
		this.number1    =    1    +    ramdon1.nextInt(9); 
		this.number2   =    1    +    ramdon1.nextInt(9); 
		  
		//if statement avoid generated equal ramdon number
		if ( this.number1==this.number2)
		{
		    this.number1    =    1    +    ramdon1.nextInt(9); 
		    this.number2   =    1    +    ramdon1.nextInt(9);
		    System.out.printf("how much is %d ",    number1);
			System.out.printf("time %d        ", number2   );    
			System.out.println(  ) ;
	    }
		/// Print random number
		else 
	    {
//		    display    generated    value
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
	    //  System.out.println(this.total);
		  
	      if (this.total!=this.userInput)
		  {
			displaynoCorrectResponse();// call a method 
			
		  }
		     
	      else displayCorrectResponse() ;//call method
	
		
		
	}
	 
	public void displayCorrectResponse() 
	{
		correctAnwers++; // counter how many good anwers
		
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
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI3 total = new CAI3();
	    total.quiz();

	}

}

