package AdaptorandProxy;

public class Adapter implements AdapterQueue, AdapterStack {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void push(String str) {
		// TODO Auto-generated method stub
		adaptee.add(str);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public void put(String str) {
		// TODO Auto-generated method stub
		adaptee.add(str);
	}

	@Override
	public String poll() {
		// TODO Auto-generated method stub
		int start = adaptee.getStart();
		String str = adaptee.startString();
		adaptee.remove(start);
		return str;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return adaptee.empty();
	}

}
