package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rowsNumber;
	private int colsNumber;
	
	public Spreadsheet(){
		Cell[][] arraySpreadsheet = new EmptyCell[rowsNumber][colsNumber];
		
		for(int i=0;i<rowsNumber; i++){
			for(int j=0; j<colsNumber; j++){
				arraySpreadsheet[i][j] = new TextCell("hello");
			}
		}
	}
	
	public void setRows(int num){
		this.rowsNumber = num;
	}
	
	public void setColumns(int num){
		this.colsNumber = num;
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
		return this.rowsNumber;
	}

	@Override
	public int getCols()
	{
		return this.colsNumber;
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
