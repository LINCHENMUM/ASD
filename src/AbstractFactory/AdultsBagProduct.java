package AbstractFactory;

public class AdultsBagProduct implements Packaging {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0.5f;
	}

	@Override
	public String getPackType() {
		// TODO Auto-generated method stub
		return "Reusable Shopper";
	}

}
