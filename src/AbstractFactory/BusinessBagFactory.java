package AbstractFactory;

public class BusinessBagFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new BusinessBagProduct();
	}
}
