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
		return(getText());
	}

	@Override
	public String fullCellText() {
		return text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		for(int i=0;i<10;i++){
			this.text += " ";
		}
	}

}
