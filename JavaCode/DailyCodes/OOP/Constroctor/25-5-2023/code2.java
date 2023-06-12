class Demo{
	int x=10;

	Demo(){			//internally- Demo(Demo this)
		System.out.println("In constroctor");
		System.out.println("this.x=" + this.x);
		System.out.println("this=" + this);
	}

	void fun(){		//internally- void fun(Demo this)
		System.out.println("in fun");
		System.out.println("this=" + this);
		System.out.println("this.x="+ this.x);
		System.out.println("x="+ x);	//internally this.x
	}

	public static void main(String args[]){
		Demo obj=new Demo();		//internally Demo obj=new Demo(obj);
		System.out.println("obj=" + obj);
		obj.fun();			//internally fun(obj);
	}
}
