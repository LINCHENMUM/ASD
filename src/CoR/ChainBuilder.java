package CoR;

public class ChainBuilder {
	private AbstractProcess handler;
	
	private void builderChain(){
		AbstractProcess validator=new Validator();
		AbstractProcess dataWasher=new DataWasher();
		AbstractProcess reporter=new Reporter();
		validator.nextProcess=dataWasher;
		dataWasher.nextProcess=reporter;
		handler=validator;
	}

	public AbstractProcess getHandler() {
		return handler;
	}

	public void setHandler(AbstractProcess handler) {
		this.handler = handler;
	}
	
	

}
