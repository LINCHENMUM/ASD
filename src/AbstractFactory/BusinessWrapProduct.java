package AbstractFactory;

public class BusinessWrapProduct implements Packaging {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0.25f;
	}

	@Override
	public String getPackType() {
		// TODO Auto-generated method stub
		return "Holiday Surprise";
	}

}
