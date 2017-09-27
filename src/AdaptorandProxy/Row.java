package AdaptorandProxy;

public class Row implements IRow {
    private IRow row; 
	public Row(Table table,int rowNum){
		row=table.getRow(rowNum);
	}
}
