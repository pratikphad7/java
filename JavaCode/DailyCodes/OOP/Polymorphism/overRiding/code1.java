class Demo{
	Demo(){
		System.out.println("In parent constroctor");
	}
	void fun(int x){
		System.out.println("In parent fun");
	}

	void gun(){
		System.out.println("in parent gun");
	}
}

class Demo1 extends Demo{
	Demo1(){
		System.out.println("In child constroctor");
	}
	void fun(int x){
		System.out.println("in child fun");
	}
}

class client{
	public static void main(String args[]){
		Demo1 obj=new Demo1();
		obj.fun(10);	//it will print child function
		obj.gun();
	}
}
