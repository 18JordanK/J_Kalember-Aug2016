package textExcel;

import java.util.Scanner;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rowsNumber;
	private int colsNumber;
	
	public Spreadsheet(int cNumber, int rNumber){
		rowsNumber = rNumber;
		colsNumber = cNumber;
		
		EmptyCell[][] arraySpreadsheet = new EmptyCell[colsNumber][rowsNumber];
		
		for(int i=0;i<rowsNumber; i++){
			for(int j=0; j<colsNumber; j++){
				arraySpreadsheet[i][j] = EmptyCell.EmptyCell();
			}
		}
	}
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows()
	{
		return rowsNumber;
	}

	@Override
	public int getCols()
	{
		return colsNumber;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
