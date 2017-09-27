package AbstractFactory1;

public class AbstractFactoryTest {
	public static void main(String[] args){
		Provider provider=new SmsFactory();
		provider.produce().sender();
		
	}
	

}
