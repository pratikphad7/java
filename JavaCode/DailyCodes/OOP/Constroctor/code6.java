class ConstroctorDemo{
	ConstroctorDemo(){
		System.out.println("In constroctor Demo");
	}

	void fun(){
		System.out.println("In fun");
	}

	public static void main(String args[]){
		ConstroctorDemo obj=new ConstroctorDemo();
		ConstroctorDemo obj2=new ConstroctorDemo();
		obj2.fun();
		
	}
}
