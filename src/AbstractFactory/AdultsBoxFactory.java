package AbstractFactory;

public class AdultsBoxFactory implements IFactory {

	@Override
	public Packaging produce() {
		// TODO Auto-generated method stub
		return new AdultsBoxProduct();
	}

}
