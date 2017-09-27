package state;

public class Regular implements State {
	
	Driving driving;
	
	public Regular(Driving driving){
		this.driving=driving;
	}

	@Override
	public int turnLeft() {
		// TODO Auto-generated method stub
        return 5;
	}

	@Override
	public int turnRight() {
		// TODO Auto-generated method stub
        return 5;
	}

	@Override
	public int accerlate() {
		// TODO Auto-generated method stub
        return 9;
	}

	@Override
	public int brake() {
		// TODO Auto-generated method stub
        return 8;
	}

}
