package com.dxf.SingletonPattern;

public class Singleton {
//	饿汉式
	private static final Singleton singleton = new Singleton();
//	限制产生多个实例
	private Singleton() {}
//	通过该方法获取实例
	public static Singleton getSingleton() {
		return singleton;
	}
//	类中的其他方法，尽量是static
	public static void demo() {
		System.out.println("hello world! my name is Singleton");
	}
	
	/** 双检锁/双重校验锁
	  private static Singleton instance;  
	    // 限制产生多个实例
	    private Singleton (){}  
	    public static synchronized Singleton getInstance() {  
	    if (instance == null) {  
	        instance = new Singleton();  
	    }  
	    return instance;  
	    }  
	    */
	    
/** 双检锁/双重校验锁
	    private volatile static Singleton singleton;  
	    限制产生多个实例
	    private Singleton (){}  
	    //	通过该方法获取实例
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
