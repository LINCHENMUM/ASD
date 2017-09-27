package FactoryMethod;

public class Factory {

	public Trace produce(String debugType) {
		if (debugType.equalsIgnoreCase("console")) {
			return new ConsoleTrace();
		} else if (debugType.equalsIgnoreCase("file")) {
			return new FileTrace();
		} else {
			System.out.println("Error debug type");
			return null;
		}
	}
}
