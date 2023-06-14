

interface Demo{
	static int z=10;
}

interface Demo1{
	static int z=30;
}

class DemoChild implements Demo1,Demo{
	void run(){
		System.out.println("Z=" + z);	
	}	
}

class client{
	public static void main(String args[]){
		Demo obj=new DemoChild();
		obj.run();
		System.out.println(obj.z);
	}
}


