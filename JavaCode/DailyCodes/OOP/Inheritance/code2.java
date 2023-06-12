class parent{
	int x=20;
	static int y=30;
	static{
		System.out.println("In parent static block");
	}
	static void fun(){
		System.out.println("y="+y);
	}
}

class child extends parent{
	static{
		System.out.println("In chaild static block");
		fun();
	}
}

class client{
	public static void main(String args[]){
		child obj=new child();
	}
}
