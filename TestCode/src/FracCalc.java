import java.awt.Point;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner userInput = new Scanner(System.in);
    	String userString = userInput.nextString();
    	System.out.println("Enter a problem.");
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
        String firstFrac = "";
        Point firstFracPosition = new Point(0,0);
        String operator = "";
        int operatorPosition = 0;
        String secondFrac = "";
        Point secondFracPosition = new Point(0,0);
        int numSpaces = 0;
    	for(int i=0; i<input.length();i++){
    		if(input.substring(i,i+1) == " " && numSpaces == 0){
    			firstFracPosition.translate(0, i-1);
    			numSpaces++;
    		}
    		if(input.substring(i,i+1) == " " && numSpaces == 0){
    			operatorPosition = i;
    			numSpaces++;
    		}
    	}
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}