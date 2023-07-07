//multiple inheritance (chalat nahi,error)

class parent1{
	int x=10;
	void fun(){
		System.out.println("In parent1-fun");
	}
}

class parent2{
	int y=20;
	void gun(){
		System.out.println("In parent2-gun");
	}
}

class child extends parent1,parent2{
	int y=30;
	void mun(){
		System.out.println("In child-mun");
	}
}

class client{
	public static void main(String[] args){
		child obj=new child();
		obj.gun();
		obj.fun();
		obj.mun();
	}
}
