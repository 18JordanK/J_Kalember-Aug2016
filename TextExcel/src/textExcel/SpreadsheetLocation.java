package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName){
		//Splits the cell
		this.column = Character.toUpperCase(cellName.charAt(0)) - 'A';
		
		String rowNumberString = cellName.substring(1);
		this.row = Integer.parseInt(rowNumberString) - 1;
	}
	
	public void setLocation(int rowNumber, int colNumber){
		this.row = rowNumber;
		this.column = colNumber;
	}
	
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return this.row;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return this.column;
    }
    
}
