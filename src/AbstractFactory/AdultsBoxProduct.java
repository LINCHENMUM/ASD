package AbstractFactory;

public class AdultsBoxProduct implements Packaging {

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0.25f;
	}

	@Override
	public String getPackType() {
		// TODO Auto-generated method stub
		return "Plain Paper";
	}

}
