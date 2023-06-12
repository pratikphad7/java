class Demo{
	void fun(int x){
		System.out.println("x=" + x);
	}

	void fun(float y){
		System.out.println("y=" + y);
	}

	void fun(Demo obj){
		System.out.println("in obj parameterized");
		System.out.println("obj=" + obj);
	}

	public static void main(String args[]){
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun(obj);
	}
}
