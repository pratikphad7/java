//body given in interface using default

interface Demo{
	default void gun(){				//internally:- public default void fun(){} 
		System.out.println("In interface");
	}
}

interface Demo1{

	default void gun(){					//internally:- public default void gun(); 
		System.out.println("In interface2");
	}
}

class DemoChild implements Demo,Demo1{
	
}

class client{
	public static void main(String args[]){
		DemoChild ref=new DemoChild();
		ref.gun();
	}
}

//error:-class DemoChild inherits unrelated defaults for gun() from types Demo and Demo1                                 class DemoChild implements Demo,Demo1{

