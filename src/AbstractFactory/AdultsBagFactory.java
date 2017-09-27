package AbstractFactory;

public class AdultsBagFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new AdultsBagProduct();
	}

	

}
