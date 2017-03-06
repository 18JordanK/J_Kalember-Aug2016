package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private static int rowNumber;
	private static int colNumber;
	
	public SpreadsheetLocation(String cellName){
		char rowLetterChar = cellName.charAt(0);
		int rowLetterInt = rowLetterChar - 'A';
		
		String colNumberString = cellName.substring(1);
		int colNumberInt = Integer.parseInt(colNumberString);

		SpreadsheetLocation.setLocation(rowLetterInt, colNumberInt);
	}
	
	public static void setLocation(int row, int col){
		rowNumber = row;
		colNumber = col;
	}
	
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return rowNumber;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return colNumber;
    }
    
}
