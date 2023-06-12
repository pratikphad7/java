class Demo{
	void fun(int x){
		System.out.println(x);
	}

	void fun(int x){
		System.out.println(x);
	}
}

class client{
	public static void main(String args[]){
		Demo obj=new Demo();
		obj.fun(10);
	}
}

//output:- method fun(int) is already defined in class Demo void fun(int x) {method segnature error}
