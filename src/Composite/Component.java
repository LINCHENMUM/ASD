package Composite;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
	private Collection<Component> list = new ArrayList<Component>();
	protected String title;
	public abstract void print();
	public void addItem(Component item){
	 list.add(item);
	 }
	public Component(String title){
		this.title=title;
	}
}
