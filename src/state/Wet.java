package state;

public class Wet implements State {
	
    Driving driving;
	
	public Wet(Driving driving){
		this.driving=driving;
	}

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int accerlate() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public int brake() {
		// TODO Auto-generated method stub
		return 7;
	}

}
