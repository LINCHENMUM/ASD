package Singleton;

public class SingletonOptimization {
	// private constructor to avoid to be instanced
	private SingletonOptimization() {

	}

	// Using an inner class to maintain the singleton
	private static class SingletonOptimizationFactory {
		private static SingletonOptimization instance = new SingletonOptimization();
	}
    //get instance
	public static SingletonOptimization getInstance() {
		return SingletonOptimizationFactory.instance;
	}

	public Object readResolve() {
		return getInstance();
	}
}
