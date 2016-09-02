
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
	
	public static double max(double num1, double num2){
		if(num1>num2){
			return(num1);
		}else{
			return(num2);
		}
	}
	
	public static double max(double num1, double num2, double num3){
		if(num1>num2){
			if(num1>=num3){
				return(num1);
			}
		}else if(num2>=num1){
			if(num2>=num3){
				return(num2);
			}
		}
		return(num3);
	}
	
	public static int min(int num1, int num2){
		if(num1<num2){
			return(num1);
		}else{
			return(num2);
		}
	}
	
	public static double round2(double num){
		return(2.2);
	}
	//Part 3:Methods that use Loops and Calls to Other Methods
	public static double exponent(int power, double base){
		return(2.2);
	}
}