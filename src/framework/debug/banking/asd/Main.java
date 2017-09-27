package framework.debug.banking.asd;

public class Main {
	public static void main(String[] args) {
		Provider provider = new LoggerFactory();
		Logger logger=provider.produce();
		//DEBUG = 1,INFO = 2,WARN = 3,ERROR = 4,FATAL = 5
		logger.setLoggerLevel(4);
		//ConsoleAppender:write to console,FileAppender write to file
		Appender appender=new ConsoleAppender();
//		Appender appender = new FileAppender();
		logger.setLoggerAppender(appender);
		logger.error("it is error log in log file");
	}
}
