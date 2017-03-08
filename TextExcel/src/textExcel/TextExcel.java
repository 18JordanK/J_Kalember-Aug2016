package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

@SuppressWarnings("unused")
public class TextExcel{

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		String userCommand = console.nextLine();
		System.out.println("Enter a command. ");
		
		Spreadsheet sprsheet = new Spreadsheet();
		sprsheet.setRows(20);
		sprsheet.setColumns(12);
		
		while(!(userCommand.equals("quit"))){
			System.out.println(sprsheet.processCommand(userCommand));
			userCommand = console.nextLine();
		}
	}
}
