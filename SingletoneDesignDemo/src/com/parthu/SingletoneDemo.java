package com.parthu;
 public class SingletoneDemo {

	static SingletoneDemo s=null;
	
	private SingletoneDemo() throws Exception{
		
	}
	
	{
		if(s!=null) {
			throw new Exception("Already obj is created");
		}
	}
	static SingletoneDemo getInstances() throws Exception{
		if(s==null) {
			s=new SingletoneDemo();
		}
		return s;
		
	}
}
