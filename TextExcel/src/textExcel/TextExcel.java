package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		String userCommand = console.nextLine();
		while(!(userCommand.equals("quit"))){
			System.out.println(Spreadsheet.processCommand(userCommand));
		}
	}
}
