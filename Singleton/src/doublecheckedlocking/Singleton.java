package doublecheckedlocking;

//˫�ؼ�������ֻ��ͬ��һ�Σ�ʹ�ùؼ���volatile��ʹ��java5���ϵİ汾������ʧЧ��
public class Singleton {
	
	private volatile static Singleton uniqueInstance;//��̬����
	//��̬������
	private Singleton(){
	}
	//��̬����
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
