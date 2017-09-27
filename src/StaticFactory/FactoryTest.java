package StaticFactory;

public class FactoryTest {
	public static void main(String[] args) {
		Sender mailSender = Factory.mailSender();
		mailSender.sender();
	}
}
