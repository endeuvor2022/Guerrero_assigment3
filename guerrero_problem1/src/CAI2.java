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
//	Modify the program from Part 1 so that various comments are displayed for each answer as follows:
//
//		Possible responses to a correct answer:
//
//		Very good!
//		Excellent!
//		Nice work!
//		Keep up the good work!
//		Possible responses to an incorrect answer:
//
//		No. Please try again.
//		Wrong. Try once more.
//		Don’t give up!
//		No. Keep trying.
//		Use random-number generation to choose a number 
	//from 1 to 4 that will be used to select one of the 
	//four appropriate responses to each correct or incorrect answer. 
	//Use a switch statement to issue the responses.
//
//		 
//
//		Requirements
//		The program shall generate random numbers with a SecureRandom object
//		The program shall ask the student to solve a multiplication problem
//		A multiplication problem shall contain two numbers sampled from a uniform random distribution in the range of 0 to 9 (inclusive)
//		The program shall display a random positive message if the student provides a correct response
//		The program shall display a random negative message if the student provides an incorrect response
//		The program shall terminate when a correct response is provided by the student
//		The program shall continue to ask the student to solve the original multiplication problem until the student provides the correct answer
//		Create a method called "quiz" that contains the program logic
//		Create a function called "askQuestion" that prints the problem to the screen
//		Create a function called "readResponse" that reads the answer from the student
//		Create a function called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
//		Create a function called "displayCorrectResponse" that prints out the response when a student enters a correct answer
//		Create a function called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
//		Part 1: Create a main method that runs your program by calling the "quiz" method
//		 
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
		    
        System.out.printf("how much is %d ",    number1);    //    display    generated    value
            
        this.number2   =    1    +    ramdon1.nextInt(9); 
		    
        System.out.printf("time %d        ", number2   );    //    display    generated    value
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
		
		//System.out.println("Very good");
		// Very good!
//			Excellent!
//			Nice work!
//			Keep up the good work!
	}
	
	public void displaynoCorrectResponse() 
	{	
		
		
		
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
        
		System.out.printf("how much is %d ",    this.number1);    
        
		
		
		System.out.printf("time %d        ", this.number2   ); 
		System.out.println(  ) ;
		readResponse();
		//No. Please try again.
//		Wrong. Try once more.
//		Don’t give up!
//		No. Keep trying.
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CAI2 total = new CAI2();
	    total.quiz();

	}

}

