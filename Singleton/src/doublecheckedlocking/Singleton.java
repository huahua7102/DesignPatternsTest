package doublecheckedlocking;

//双重检查加锁，只会同步一次，使用关键字volatile，使用java5以上的版本，否则失效；
public class Singleton {
	
	private volatile static Singleton uniqueInstance;//静态变量
	//静态构造器
	private Singleton(){
	}
	//静态方法
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			synchronized (Singleton.class) {
				if(uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance;
	}
}
