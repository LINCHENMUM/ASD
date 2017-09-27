package AbstractFactory;

public class BusinessWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new BusinessWrapProduct();
	}
}
