import java.util.*;

public class FracCalc {
	@SuppressWarnings("resource")
	public static void main(String[] args){
    	Scanner userInput = new Scanner(System.in);
    	String userString = userInput.nextLine();
    	System.out.println("Enter a problem.");
    	produceAnswer(userString);
    	
    	while(userString != "quit"){
    		if(userString.toLowerCase() == "quit"){
    			break;
    		}
    		produceAnswer(userString);
    		userString = userInput.nextLine();
    	}
    	
    	System.out.println(produceAnswer(userString));
    	
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        int numSpaces = 0;
        int indx = 0;
        int firstIndx = 0;
        int lastIndx = 0;
    	
        String firstOperand = "";
    	while(numSpaces == 0){
    		if(input == " "){
    			numSpaces++;
    			lastIndx = indx;
    		}
    		indx++;
    	}
    	firstOperand += input.indexOf(firstIndx, lastIndx+1);
    	
        String operator = "";
        while(numSpaces == 1){
        	firstIndx = indx;
    		if(input == " "){
    			numSpaces++;
    			lastIndx = indx;
    		}
    		indx++;
    	}
        operator += input.indexOf(firstIndx, lastIndx+1);
        
        String secondOperand = "";
        while(numSpaces == 0){
        	firstIndx = 0;
    		if(input == " "){
    			numSpaces++;
    			lastIndx = indx;
    		}
    		indx++;
    	}
        
        secondOperand += input.indexOf(firstIndx, lastIndx+1);
        return("whole:" + secondWholeNum + "numerator:" + secondNumerator + "denominator:" + secondDenominator);
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}