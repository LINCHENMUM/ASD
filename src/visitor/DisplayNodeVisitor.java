package visitor;

public class DisplayNodeVisitor implements NodeVisitor {
	
	private String side;
	private String name;

	@Override
	public void Visitor(Root root) {
		// TODO Auto-generated method stub
       this.name=root.getName();
       this.side=root.getSide();
	}
	@Override
	public void Visitor(Node node) {
		// TODO Auto-generated method stub
		this.name=node.getName();
	    this.side=node.getSide();
	}

}
