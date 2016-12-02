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
    
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    	String[] splitString = splitTheString(input); 
    	return input;
    }
    
    public static String[] splitTheString(String input){
    	String[] components = new String[3];
    	
    	String firstOperand = "";
    	String calculation = "";
    	String secondOperand = "";
    	
    	//Gets the index of the space and stores in variables
    	int indxOfFirstSpace = 0;
    	int indxOfSecondSpace = 0;
    	int i = 0;
    	while(i<components.length){
    		if(indxOfFirstSpace == 0 && components[i] != " "){
    			indxOfFirstSpace = i;
    		}
    		if(indxOfSecondSpace == 0 && components[i] != " "){
    			indxOfSecondSpace = i;
    		}
    		i++;
    	}
    	
    	firstOperand = subString(0,indxOfFirstSpace);
    	calculation = subString(indxOfFirstSpace+1, indxOfSecondSpace);
    	secondOperand = subString(indxOfSecondSpace+1);
    	
    	//Adds the strings of the operand and calculation to Array
    	components[0] = firstOperand;
    	components[1] = calculation;
    	components[2] = secondOperand;
    	
    	return components;
    }
    
    public static void toImproperFrac(int[] arr){
    	int numerator = arr[2] * arr[0] + arr[1];
    	int denominator = arr[2];
    	
    	arr[0] = numerator;
    	arr[1] = denominator;
    }
    
    public static int multiplyDivide(int[] arr1, int[] arr2, boolean divide){
    	//Swaps the values of the numerator and denominator to become reciprocal when divide
    	if(divide){
    		int control = arr2[0];
    		arr2[0] = arr2[1];
    		arr2[2] = control;
    	}
    	int productNumerator = arr1[0] * arr1[0];
    	int productDenominator = arr1[1] * arr2[1];
    	
    	return(productNumerator/productDenominator);
    }
    
    public static int addSubtract(int[] arr1, int[] arr2, boolean subtract){
    	// Makes numerator of second operand negative when its subtraction
    	if(subtract){
    		arr2[0] *= -1;
    	}
    	int num1 = arr1[0] * arr2[1];
    	int num2 = arr2[0] * arr1[1];
    	
    	int sumNumerator = num1+num2;
    	int sumDenominator = arr1[1] * arr1[1];
    	
    	return (sumNumerator/sumDenominator);
    }
    // TODO: Fill in the space below with any helper methods that you think you will need
 }