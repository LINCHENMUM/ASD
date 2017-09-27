package Composite;

import java.util.ArrayList;
import java.util.Collection;

public class Composite extends Component {
	private Collection<Component> list = new ArrayList<Component>();
	public Composite(String title){
		super(title);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
        System.out.println("Composite name="+title);
        for (Component item:list){
        	item.print();
        }
	}

}
