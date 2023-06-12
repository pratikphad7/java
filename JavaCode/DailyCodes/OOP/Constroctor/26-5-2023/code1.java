//this refference

class Demo{
	int x=10;
	Demo(){
		System.out.println("in no-arg constroctor");
	}

	Demo(int x){
		this(); //internally-> Demo();
			//it called as constroctor chaining
			//we can't call this() and super() in same constroctor
		System.out.println("in parameterized constroctor");
	}

	public static void main(String args[]){
		Demo obj=new Demo();
		Demo obj1=new Demo(10);
	}
}
