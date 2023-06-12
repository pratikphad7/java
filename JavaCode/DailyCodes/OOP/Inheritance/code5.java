class Parent{
	Parent(){
		System.out.println("In parent constroctor");
	}	

	void access(){
		System.out.println("In parent Instance method");
	}
}

class Chield extends Parent{
	int y=20;
	Chield(){
		System.out.println("In chield controctor");
	}
}

class client{
		Player obj=new Player(7,msd);
	public static void main(String args[]){
		System.out.println("In main method");
		Chield obj=new Chield();
		obj.access();
	}
}
