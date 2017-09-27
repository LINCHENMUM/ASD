package MultiFactory;

public class Factory {
	
	public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}

}
