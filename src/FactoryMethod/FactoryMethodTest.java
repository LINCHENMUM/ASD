package FactoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		
		String debugMsg="Register";
		String errorMsg="Error message";

		Factory factory = new Factory();
		Trace trace = factory.produce("file");
		trace.setDebug(true);
		trace.debug(debugMsg);
		trace.error(errorMsg);
	}
}
