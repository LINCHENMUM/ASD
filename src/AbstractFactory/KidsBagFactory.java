package AbstractFactory;

public class KidsBagFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new KidsBagProduct();
	}

}
