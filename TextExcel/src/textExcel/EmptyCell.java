package textExcel;

public class EmptyCell implements Cell {
	private String text;
	
	public EmptyCell(){
		setText("");
		for(int i=0;i<10;i++){
			setText(getText() + " ");
		}
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
