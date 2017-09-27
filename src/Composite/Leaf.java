package Composite;

public class Leaf extends Component {
	
	private String number;
    public Leaf(String number,String title){
    	super(title);
    	this.number=number;
    }

	@Override
	public void print() {
		// TODO Auto-generated method stub
        System.out.println("Leaf [isbn="+number+", title="+title+"]");
	}

}
