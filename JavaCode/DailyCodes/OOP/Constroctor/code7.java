class Demo{
	int x=7;
	String str="MSD";

	void Display(){
		System.out.println(x+"="+str);
	}

	public static void main(String args[]){
		Demo obj=new Demo();
		obj.Display();
		//System.out.println(x+"="+str);  error
		System.out.println(obj.x+"="+obj.str);
	}
}
