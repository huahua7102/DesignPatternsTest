package threadsafe;

//线程安全：同步（synchronized）getInstance()方法（线程安全的懒汉模式）
/*
 * 饿汉模式：private static Singleton uniqueInstance = new Singleton();
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getInstance(){
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
	

}
