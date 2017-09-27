package AbstractFactory;

public class KidsWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new KidsWrapProduct();
	}

}
