package classic;

/*
 * ���䵥��ģʽ(����ģʽ��
 * ���̲߳���ȫ��
 */
public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
	
	//��������
	public String getDescription(){
		return "���䵥��ģʽ";
	}
	
}