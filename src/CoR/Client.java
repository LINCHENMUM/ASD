package CoR;

public class Client {
	private ChainBuilder chain;

	public void sendCall(CallRecord call) {
		chain.getHandler().handleCall(call);
	}
}
