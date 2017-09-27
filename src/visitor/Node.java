package visitor;

public class Node extends Root {
	
	private Root root;
	public Node(Root root,String name,String side) {
		super(name,side);
		// TODO Auto-generated constructor stub
		this.root=root;
	}
	
	public Root getRoot() {
		return root;
	}
	public void setRoot(Root root) {
		this.root = root;
	}
	
}
