package textExcel;

import java.util.Scanner;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private static int rowsNumber;
	private static int colsNumber;
	
	public Spreadsheet(){
		EmptyCell[][] arraySpreadsheet = new EmptyCell[20][12];
		
		for(int i=0;i<rowsNumber; i++){
			for(int j=0; j<colsNumber; j++){
				arraySpreadsheet[i][j] = EmptyCell.EmptyCell();
			}
		}
	}
	
	public void setRows(int num){
		rowsNumber = num;
	}
	
	public void setColumns(int num){
		colsNumber = num;
	}
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return command;
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
