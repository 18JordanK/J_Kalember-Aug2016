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
    	int[] 
    	
    	if(arr[1] == "+"){
    		input = addSubtract(arr[0],arr[1],false);
    	}else if(arr[1] == "-"){
    		input = addSubtract(arr[0],arr[1],true);
    	}else if(arr[1] == "*"){
    		input = multDivide(arr[0],arr[1],true);
    	}else if(arr[1] == "/"){
    		input = multiplyDivide(arr[0],arr[1],false);
    	}
    	
    	String[] components = new String[3];
    	
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
    	
    	//Uses the index to get strings of each 
    	String firstOperand = input.substring(0,indxOfFirstSpace);
    	String calculation = input.substring(indxOfFirstSpace+1, indxOfSecondSpace);
    	String secondOperand = input.substring(indxOfSecondSpace+1);
    	
    	//Adds the String of operands and calculations to Array
    	components[0] = firstOperand;
    	components[1] = calculation;
    	components[2] = secondOperand;
    	
    	int[] parsedOperands1 = parseOperands(components[0]);
    	int[] parsedOperands2 = parseOperands(components[2]);
    	
    	return input;
    }
    
    public static int[] parseOperands(String operand){
    	int indxOfUnderscore = 0;
    	int indxOfSlash = 0;
    	int[] components = {3};
    	
    	if(operand.contains("_")){
    		indxOfUnderscore = operand.indexOf("_");
    	}
    	if(operand.contains("/")){
    		indxOfUnderscore = operand.indexOf("/");
    	}
    		
    	if(indxOfUnderscore == 0 && indxOfSlash == 0){
    		components[1] = 0;
    		components[2] = 1;
    	}else if(indxOfUnderscore == 0){
    		components[0] = 0;
    	}else if(indxOfSlash == 0){
    		components[1] = 1;
    	}
    	String wholeNum = operand.substring(0, indxOfUnderscore+1); 
    	String numerator = operand.substring(indxOfUnderscore+1, indxOfSlash+1);
    	String denominator = operand.substring(indxOfSlash+1);
    	components = (wholeNum,numerator,denominator);
    	
    	//Changes the arr(whole,numerator,denominator) to (numerator,denominator).
    	toImproperFrac(components);
    	
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