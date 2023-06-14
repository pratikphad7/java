//body given in interface using default

interface Demo{
	default void fun(){				//internally:- public default void fun(){} 
		System.out.println("In interface");
	}

	void gun();					//internally:- public abstract void gun(); 
}

class DemoChild implements Demo{
	public void gun(){
		System.out.println("In class DemoChild");	
	}
}

class client{
	public static void main(String args[]){
		DemoChild ref=new DemoChild();
		ref.fun();
		ref.gun();
	}
}
