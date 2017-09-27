package mediator;

public class CellImpl extends Cell {

	public CellImpl(BoardMediator mediator, int x, int y) {
		super(mediator, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		this.setColor(color);
	}
}
