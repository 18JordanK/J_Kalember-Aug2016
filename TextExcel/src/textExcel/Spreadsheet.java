package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rowsNumber = 20;
	private int colsNumber = 12;
	Cell[][] arraySpreadsheet = new EmptyCell[rowsNumber][colsNumber];
	
	public Spreadsheet(){
		for(int i=0;i<rowsNumber; i++){
			for(int j=0; j<colsNumber; j++){
				arraySpreadsheet[i][j] = new EmptyCell();
			}
		}
		setRows(rowsNumber);
		setColumns(colsNumber);
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
		command = command.toLowerCase();
		if(command.equals("clear")){
		
		}
		
		//checks if command is a cell inspection
		if(command.length() == 2){
			
		}
		
		if((command.length() == 2)){
			
		}
		return "";
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
		String gridText = "";
		//for(int i=0; i<)
		return null;
	}

}
