package AbstractFactory;

public class AdultsWrapFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new AdultsWrapProduct();
	}

}
