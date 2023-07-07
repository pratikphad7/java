class Demo{
	Demo(){
		System.out.println("in parent constroctor");
	}
	void fun(int x){
		System.out.println("In parent-fun");
	}
}

class Demo1 extends Demo{
	Demo1(){
		System.out.println("in child constroctor");
	}
	void fun(int x){
		System.out.println("in child fun");
	}
	void gun(){
		System.out.println("In child-gun");
	}
}

class Client{
	public static void main(String args[]){
		Demo obj=new Demo1();
		obj.fun(10);
		obj.gun();

		Demo obj1=new Demo();
		obj.fun(10);
		obj.gun();	//error:- can not find Symbol(parent class la child chya methods and variables 						  		      disat nahi)
		
		Demo1 obj2=new Demo();	//parent child madhe convert hou shakat nahi
	}
}
