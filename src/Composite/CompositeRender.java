package Composite;

import java.util.Enumeration;

public class CompositeRender extends ComponentRender {
	
	public CompositeRender(String name){
		super(name);
	}

	@Override
	public void addChildren(ComponentRender node) {
		// TODO Auto-generated method stub
		children.add(node);
		
	}

	@Override
	public void removeChildren(ComponentRender node) {
		// TODO Auto-generated method stub
		children.remove(node);
	}

	@Override
	public Enumeration<ComponentRender> getChildren() {
		// TODO Auto-generated method stub
		return children.elements();
	}

	@Override
	public void printNode() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
