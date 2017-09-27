package state;

public class Ice implements State {
	
   Driving driving;
	
	public Ice(Driving driving){
		this.driving=driving;
	}

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int accerlate() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int brake() {
		// TODO Auto-generated method stub
		return 2;
	}

}
