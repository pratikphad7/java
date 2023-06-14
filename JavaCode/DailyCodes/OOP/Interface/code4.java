interface Demo{
	void fun();
	void gun();
}

interface Demo1{
	void fun();
	void gun();
}


class DemoChild implements Demo,Demo1{

	public void fun(){			//error:-
		System.out.println("In fun");
	}

	public void gun(){
		System.out.println("In gun");	
	}
}

class client{
	public static void main(String args[]){
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
		
		Demo1 obj1=new DemoChild();
		obj1.fun();
		obj1.gun();
	}
}
