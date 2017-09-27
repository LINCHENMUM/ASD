package FactoryMethod;

public class FileTrace implements Trace {

	@Override
	public void setDebug(boolean debug) {
		// TODO Auto-generated method stub
		if (debug){
			//turn on the file debug function
		}else{
			//turn off the file debug function
		}
	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
        System.out.println("File Debug Message:"+message);
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error message:"+message);
	}

}
