class Demo{
	int x=10;
	Demo(){							//internally-> Demo(Demo this)
		System.out.println("In no-args constroctor");
	}

	Demo(int x){						//internally-> Demo(Demo this,int x)
		System.out.println("In parameterized constroctor");	
	}

	public static void main(String args[]){
		Demo obj1=new Demo();				//internally-> Demo(obj1)
		Demo obj2=new Demo(10);				//internally-> Demo(obj2,10);
	}
}
