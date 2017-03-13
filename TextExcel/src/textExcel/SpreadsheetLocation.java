package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName){
		char colLetterChar = cellName.charAt(0);
		int colLetterInt = colLetterChar - 'A';
		
		String rowNumberString = cellName.substring(1);
		int rowNumberInt = Integer.parseInt(rowNumberString) - 1;
		
		setLocation(rowNumberInt, colLetterInt);
		
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
