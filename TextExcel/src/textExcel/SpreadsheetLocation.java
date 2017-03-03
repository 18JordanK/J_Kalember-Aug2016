package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private char rowLetter;
	private int colNumber;
	
	public SpreadsheetLocation(String cellName){
		char rowLetterChar = cellName.charAt(0);
		
		String colNumberString = cellName.substring(1);
		int colNumberInt = Integer.parseInt(colNumberString);
		
		rowLetter = rowLetterChar;
		colNumber = colNumberInt;
	}
	
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return rowLetter;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return colNumber;
    }
    
}
