package state;

public class Gravel implements State {
	
    Driving driving;
	
	public Gravel(Driving driving){
		this.driving=driving;
	}
	

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int accerlate() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int brake() {
		// TODO Auto-generated method stub
		return 6;
	}

}
