package textExcel;

import java.util.Scanner;

public class TextCell implements Cell {
	static String safeword = "quit";
	
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String userCommand = console.nextLine();
		while(!(userCommand.equals(safeword))){
			processCommand(userCommand);
		}
		
	}
	
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return null;
	}

}
