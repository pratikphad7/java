//body given in interface using default

interface Demo{
	static void gun(){				//internally:- public static void fun(){} 
		System.out.println("In interface");
	}
}

interface Demo1{

	static void gun(){					//internally:- public static void gun(); 
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

//error:- we can't access interface's static methods through object name, we can access it only class name
