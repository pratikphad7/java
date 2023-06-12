class Demo{
	static int x=10;
	int y=20;
	Demo(){
		System.out.println("In constroctor");
	}

	Demo(Demo ptr){
		System.out.println("In constroctor paradise");
	}

	static{
		System.out.println("In static");
	}

	{
		System.out.println("In instance block");
	}

	public static void main(String args[]){
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj2=new Demo(obj2);
	}
}
