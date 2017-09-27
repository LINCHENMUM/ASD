package CoR;

public abstract class AbstractProcess {
	protected AbstractProcess nextProcess;

	abstract public void handleCall(CallRecord call);

	boolean canHandleCall(CallRecord call) {
		return true;
	}
}
