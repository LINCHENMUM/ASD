package decorator;

import java.util.LinkedList;
import java.util.List;

public class DecoratorLinkedList<E> extends LinkedList<E> {
	private static final long serialVersionUID = 1L;

//	public DecoratorLinkedList(List<E> linkedlist) {
//		super(linkedlist);
//	}

	public int size() {
		return super.size();
	}

	public boolean add(E e) {
		return super.add(e);
	}

	public boolean remove(Object o) {
		return super.remove(o);
	}
	
	public boolean contains(Object o){
		return super.contains(o);
	}
}
