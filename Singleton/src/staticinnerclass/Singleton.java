package staticinnerclass;

/*
 * ��̬�ڲ��෽������һ�μ���Singleton��ʱ�������ʼ��sInstance��
 * ֻ�е�һ�ε���getInstance����ʱ���������SingletonHolder ����ʼ��sInstance ��
����������ȷ���̰߳�ȫҲ�ܱ�֤Singleton���Ψһ�ԣ������Ƽ�ʹ�þ�̬�ڲ��൥��ģʽ��
 */

public class Singleton {
	 private Singleton(){
	    }
	      public static Singleton getInstance(){  
	        return SingletonHolder.sInstance;  
	    }  
	    private static class SingletonHolder {  
	        private static final Singleton sInstance = new Singleton();  
	    }  
}
