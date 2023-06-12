class parent{
	static int x=10;
        int y=20;
	
	static{
		System.out.println("In static block");
		System.out.println("x=" + x + "\n");
	}	

	{
		System.out.println("In Instance Block");
		System.out.println("x=" + x);
		System.out.println("y= " + y + "\n");
	}

	parent(){
		System.out.println("In parent constroctor\n");
	}

	static void fun(){
		System.out.println("In static method");
		System.out.println("X=" + x + "\n");
	}

	void gun(){
		System.out.println("In instance method");
		System.out.println("x=" + x);
		System.out.println("y=" + y + "\n");
	}
}

class child extends parent{
	child(){
		System.out.println("In child constroctor\n");
	}
}

class client{
	public static void main(String args[]){
		System.out.println("In main method");
		child obj=new child();
		obj.fun();
		obj.gun(); //or child.gun()  //or parent.gun()
	}
}
