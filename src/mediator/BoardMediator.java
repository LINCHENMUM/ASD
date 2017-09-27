package mediator;

public interface BoardMediator {
	// color-black,white,null
	public void changeCellColor(String color,Cell cell);
	public void addCell(Cell cell);

}
