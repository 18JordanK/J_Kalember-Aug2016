package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName){
		String rowNumberString = cellName.substring(1);
		
		setLocation(Character.toUpperCase(cellName.charAt(0)) - 'A', Integer.parseInt(rowNumberString) - 1);
	}
	
	public void setLocation(int rowNumber, int colNumber){
		this.row = rowNumber;
		this.column = colNumber;
	}
	
    @Override
    public int getRow(){
        
        return this.row;
    }

    @Override
    public int getCol(){
        
        return this.column;
    }
    
}
