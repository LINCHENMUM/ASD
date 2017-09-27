package Composite;

import java.util.Enumeration;
import java.util.Vector;

public abstract class ComponentRender {
	public String name;
	public ComponentRender parent;
	public Vector<ComponentRender> children=new Vector<ComponentRender>();
	
	public abstract void addChildren(ComponentRender node);
	public abstract void removeChildren(ComponentRender node);
	public abstract Enumeration<ComponentRender> getChildren();
	public abstract void printNode();
	
	
	public ComponentRender(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ComponentRender getParent() {
		return parent;
	}
	public void setParent(ComponentRender parent) {
		this.parent = parent;
	}
	
}
