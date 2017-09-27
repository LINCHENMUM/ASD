package MultiFactory;

public class FactoryTest {
	public static void main(String[] args){
		Factory factory=new Factory();
		Sender mail=factory.produceMail();
		mail.sender();
	}

}
