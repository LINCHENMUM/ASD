package compositeDemo;

public class Tree {
	
	TreeNode root =null;
	public Tree(String name){
		root=new TreeNode(name);
	} 
	public static void main(String[] args){
		Tree tree =new Tree("A");
		TreeNode nodeB=new TreeNode("B");
		TreeNode nodeC=new TreeNode("C");
		nodeB.addChild(nodeC);
		
		tree.root.addChild(nodeB);
		System.out.println("Build the tree finished");
	}

}
