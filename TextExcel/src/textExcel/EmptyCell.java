package textExcel;

public class EmptyCell implements Cell {
	
	public EmptyCell(){
		String text = "";
		for(int i=0;i<10;i++){
			text += " ";
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

}
