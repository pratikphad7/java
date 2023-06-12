class Demo{
	int x=10;

	Demo(){
		System.out.println("in constroctor\n X=" + x);
	}

	public static void main(String args[]){
		Demo obj=new Demo();
		obj.fun();
	}

	void fun(){
		System.out.println("in fun\n x=" + x);
	}
}
