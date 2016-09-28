
public class Calculate {
	
	//Part 1:Methods, Headers, and Basic Math
	public static int square(int number){
		return(number*number);
	}
	
	public static int cube(int number){
		return(number*number*number);
	}
	
	public static double average(double number, double number2){
		return((number+number2)/2);
	}
	
	public static double average(double number, double number2, double number3){
		return((number*number2*number3)/3);
	}
	
	public static double toDegrees(double radians){
		return(radians*3.14159/180);
	}
	
	public static double toRadians(double angleMeasure){
		return(angleMeasure*180/3.14159);
	}
	
	public static double discriminant(double a, double b, double c){
		return(b*b-(4*a*c));
	}
	
	public static void toImproperFrac(int wholeNum, int numerator, int denominator){
		int improperNumerator = (wholeNum*denominator) + numerator;
		System.out.println(improperNumerator + "/" + denominator);
	}
	
	public static void toMixedNum(int numerator, int denominator){
		int wholeNum = numerator/denominator ;
		int mixedNumerator = numerator%denominator ;
		int mixedDenominator = denominator;
		System.out.println(wholeNum + "_" + mixedNumerator + "/" + mixedDenominator);
	}
	
	public static void foil(int first, int inner, int outer, int last ,char var){
		int a = first*outer;
		int b = (first*last) - (inner*outer);
		int c = inner*last;
		System.out.println(a + var + "^2 +" + b + var + c);
	}
	
	// Part 2: Methods with Conditionals
	public static boolean isDivisbleBy(int num1, int num2){
		return(num1%num2==0);
	}
	
	public static double absValue(double num){
		if(num<0){
			return(0-num);
		}else{
			return(num);
		}
	}
	
	public static boolean max(int num1, int num2){
		return(num1>num2);
	}
	
	public static boolean max(double num1, double num2, double num3){
		return(num1>num2 && num1>num3);
	}
	
	public static boolean min(int num1, int num2){
		return(num1<num2);
	}
	
	public static double round2(double num){
		double numRoundedBy2 = num*100;
		numRoundedBy2 += 0.5;
		numRoundedBy2 = (int)numRoundedBy2;
		return(numRoundedBy2/100);
		
	}

	//Part 3:Methods that use Loops and Calls to Other Methods
	public static double exponent(int power, double base){
		double exponentValue = 1;
		if(power>0){
			for(int i=0; i<power; i++){
				exponentValue *= base;
			}
		}else{
			for(int i=0; i<power; i++){
				exponentValue /= base;
			}
		}
		return(exponentValue);
	}
	
	public static int factorial(int num){
		int factorialValue = 1;
		if(num<0){
			throw new IllegalArgumentException("The Factorial is not possible.");
		}else{
			for(int i=num; i>0; i--){
				factorialValue *= i;
			}
			return(factorialValue);
		}
	}
	
	public static boolean isPrime(int num){
		int numFactors = 0;
		int factor = 1;
		for(int i=0; i<num; i++){
			if(Calculate.isDivisbleBy(num, factor)){
				numFactors++;
			}
			factor ++;
		}
		return(numFactors>2);
	}
	
	public static int gcf(int num1, int num2){
		int divider = 0;
		int greaterNum = 0;
		if(Calculate.max(num1, num2)){
			greaterNum = num1;
		}else{
			greaterNum = num2;
		}
		int gcf = 1;
		for(int i=0;i<greaterNum;i++){
			if(Calculate.isDivisbleBy(num1, divider)){
				gcf = divider;
			}
			divider++;
		}
		return(gcf);
	}
	
	public static double sqrt(double num){
		if(num<0){
			throw new IllegalArgumentException(num + " has no square roots.");
		}else{
			double squareRoot = (num + (num+1)/Calculate.sqrt(num))/20;
			return(squareRoot);
		}
	}
	
	//Part 4:Throwing Exceptions
	public static String quadForm(int a, int b, int c){
		if(Calculate.discriminant(a, b, c)!=0){
			System.out.println(2 + " solutions");
		}else if(Calculate.discriminant(a, b, c)==0){
			System.out.println(1 + " solutions");
		}else{
			System.out.println(" No solutions");
		}
		double val1 = -b+Calculate.sqrt(Calculate.discriminant(a, b, c))/2;
		double val2 = -b-Calculate.sqrt(Calculate.discriminant(a, b, c))/2;
		return(val1 + " and " + val2);
	}
}



