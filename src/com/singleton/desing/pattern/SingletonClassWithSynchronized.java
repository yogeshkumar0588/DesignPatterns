package com.singleton.desing.pattern;

public class SingletonClassWithSynchronized {

	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingletonClassWithSynchronized singletonInstance;
	
	private SingletonClassWithSynchronized() {
		// private constructor
	}
	
	public static SingletonClassWithSynchronized getInstance()
	  {
	    if (singletonInstance == null)
	    {
	      //synchronized block to remove overhead
	      synchronized (SingletonClassWithSynchronized.class)
	      {
	        if(singletonInstance==null)
	        {
	          // if instance is null, initialize
	        	singletonInstance = new SingletonClassWithSynchronized();
	        }
	       
	      }
	    }
	    return singletonInstance;
	  }
	
	public void simpleMethod() {
		System.out.println("hashcode of singleton object " +singletonInstance);
	}
}
