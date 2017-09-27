package Singleton;

public class Singleton {

	// private static instance to avoid to be referenced
	private static Singleton instance = null;

	// private constructor to avoid to be instanced
	private Singleton() {

	}

	// lock the Singleton object when the instance is created at the first
	// time
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public Object readResolve() {  
        return instance;  
    } 
}
