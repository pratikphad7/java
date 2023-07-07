

class parent{
	int x=10;
	void fun(){
		System.out.println("In parent1-fun");
	}
}

class child1 extends parent{
	int y=20;
	void gun(){
		System.out.println("In child1-gun");
	}
}

class child2 extends parent{
	int y=30;
	void gun(){
		System.out.println("In child2-gun");
	}
}

class client{
	public static void main(String[] args){
		child1 obj=new child1();
		obj.gun();
		obj.fun();
		child2 obj1=new child2();
		obj1.gun();
		obj1.fun();
	}
}
