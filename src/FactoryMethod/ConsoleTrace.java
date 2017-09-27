package FactoryMethod;

public class ConsoleTrace implements Trace {

	@Override
	public void setDebug(boolean debug) {
		// TODO Auto-generated method stub
		if (debug){
			//turn on the console debug function
		}else{
			//turn off the console debug function
		}
	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
        System.out.println("Console Debug Message:"+message);
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error message:"+message);
	}

}
