package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

@SuppressWarnings("unused")
public class TextExcel{

	public static void main(String[] args){
		@SuppressWarnings("resource")
		//Setup scanner
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a command. ");
		String userCommand = console.nextLine();
		
		Spreadsheet sprsheet = new Spreadsheet();
		//Loop through commands, send to processCommand method.
		while(!(userCommand.equals("quit"))){
			System.out.println(sprsheet.processCommand(userCommand));
			userCommand = console.nextLine();
		}
		
		
	}
}
