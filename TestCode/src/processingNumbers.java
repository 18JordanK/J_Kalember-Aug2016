import java.util.*;
public class processingNumbers {
	
	
	@SuppressWarnings("resource")
	public static void ProcessingNumbers(){
		Scanner userInput = new Scanner(System.in);
		int inputNumber = userInput.nextInt();
		int min = inputNumber;
		int max = inputNumber;
		int totalSum = 0;
		System.out.println("Enter 5 even integers.");
		for(int i=0;i<5;i++){
			if(inputNumber%2!=0){
				inputNumber = userInput.nextInt();
			}
			if(inputNumber<min){
				min = inputNumber;
			}else if(inputNumber>max){
				max = inputNumber;
			}
			totalSum += inputNumber;
			inputNumber = userInput.nextInt();
		}
		System.out.println(totalSum);
		System.out.println(max);
		System.out.println(min);
	}
}
