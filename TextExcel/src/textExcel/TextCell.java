package textExcel;

public class TextCell implements Cell {
	private String text;
	
	public TextCell(String t){
		this.text = t;
	}
	
	public String truncate(String text){
		String truncatedText = text.substring(10);
		return truncatedText;
	}
	
	public String padToTen(String text){
		String paddedText;
		for(int i=text.length();i<10;i++){
			text += " ";
		}
		paddedText = text;
		return paddedText;
	}
	
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return null;
	}

}
