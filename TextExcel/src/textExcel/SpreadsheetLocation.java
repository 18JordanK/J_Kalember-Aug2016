package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName){
		char rowLetterChar = cellName.charAt(0);
		int rowLetterInt = rowLetterChar - 'A';
		
		String colNumberString = cellName.substring(1);
		int colNumberInt = Integer.parseInt(colNumberString);
		
		this.row = rowLetterInt;
		this.column = colNumberInt - 1;
		
	}
	
	public void setLocation(int rowNumber, int colNumber){
		
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
