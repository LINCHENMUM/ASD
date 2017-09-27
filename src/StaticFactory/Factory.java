package StaticFactory;

public class Factory {

	public static Sender mailSender() {
		return new MailSender();
	}

	public static Sender smsSender() {
		return new SmsSender();
	}

}
