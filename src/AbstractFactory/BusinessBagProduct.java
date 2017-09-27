package AbstractFactory;

public class BusinessBagProduct implements Packaging {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0.5f;
	}

	@Override
	public String getPackType() {
		// TODO Auto-generated method stub
		return "Merchant Collection";
	}

}
