class parent{
	int x=10;
	static int y=20;
	static{
		System.out.println("------------------------------------");
		System.out.println("In parent static block");
		System.out.println("Y=" + y + "(access from parent static block)");
		System.out.println("------------------------------------");
		System.out.println();
	}

	parent(){
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("In parent constroctor");
		System.out.println("Y=" + y + "(access from parent constroctor)");
		System.out.println("x=" + x + "(access from parent constroctor)");
		System.out.println("------------------------------------");
		System.out.println();
	}

	void fun(){
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("In parent non static fun");
		System.out.println("Y=" + y + "(access from parent fun)");
		System.out.println("x=" + x + "(access from parent fun)");	
		System.out.println("------------------------------------");
		System.out.println();
	}
	
	static void gun(){
		System.out.println("In parent static gun");
		System.out.println("Y=" + y + "(access from parent gun)");
		//System.out.println("x=" + x + "(access from parent gun)");	 can not acssess without creating object
	}
}

class child extends parent{
	static{
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("In child static block");
		System.out.println("Y=" + y + "(access from child static block)");
		//System.out.println("Fun from child static block="+fun());     can not access from static block
		System.out.println("gun from child static block=\n----------------------------------");
		gun();
		System.out.println("------------------------------------");
		System.out.println();
	}

	child(){
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("In child constroctor");
		System.out.println("Y=" + y + "(access from child constroctor)");
		System.out.println("x=" + x + "(access from child constroctor)");
		System.out.println("Fun from child constroctor=\n----------------------------------");
		fun();
		System.out.println("-------------------------\ngun from child constroctor=\n------------------------------------");
		gun();
		System.out.println("------------------------------------");
		System.out.println();
	}
}

class client{
	public static void main(String args[]){
		System.out.println("In main");
		System.out.println();
		System.out.println("------------------------------------");
		child obj=new child();
	}
}
