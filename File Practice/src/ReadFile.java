import java.io.*;
import java.util.*;

public class ReadFile {
	public static void fileReader(){
		File weather = new File("./resources/weather.txt");
		Scanner input = new Scanner(weather);
		
		double currNum = input.nextDouble();
		
		for(int i=0;i<weather.length();i++){
			double nextNum = input.nextDouble();
			double difference = nextNum - currNum;
			
			System.out.println(currNum + " to " + nextNum + ", change = " + difference);
			currNum = nextNum;
		}
	}
}
