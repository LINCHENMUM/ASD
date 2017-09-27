package AbstractFactory;

public class BuinessBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new BusinessBoxProduct();
	}
}
