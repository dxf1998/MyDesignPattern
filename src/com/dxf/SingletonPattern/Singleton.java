package com.dxf.SingletonPattern;

public class Singleton {
//	����ʽ
	private static final Singleton singleton = new Singleton();
//	���Ʋ������ʵ��
	private Singleton() {}
//	ͨ���÷�����ȡʵ��
	public static Singleton getSingleton() {
		return singleton;
	}
//	���е�����������������static
	public static void demo() {
		System.out.println("hello world! my name is Singleton");
	}
	
	/** ˫����/˫��У����
	  private static Singleton instance;  
	    // ���Ʋ������ʵ��
	    private Singleton (){}  
	    public static synchronized Singleton getInstance() {  
	    if (instance == null) {  
	        instance = new Singleton();  
	    }  
	    return instance;  
	    }  
	    */
	    
/** ˫����/˫��У����
	    private volatile static Singleton singleton;  
	    ���Ʋ������ʵ��
	    private Singleton (){}  
	    //	ͨ���÷�����ȡʵ��
	    public static Singleton getSingleton() {  
	    if (singleton == null) {  
	        synchronized (Singleton.class) {  
	        if (singleton == null) {  
	            singleton = new Singleton();  
	        }  
	        }  
	    }  
	    return singleton;  
	    }  
*/
}
