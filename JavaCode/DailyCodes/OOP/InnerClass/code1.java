//Normal Inner class

class Outer{
	class Inner{
		void m1(){
			System.out.println("In inner m1");
		}
	}

	void m2(){
		System.out.println("in outer m2");
	}
}

class main{
	public static void main(String args[]){
		Outer obj = new Outer();
		obj.m2();
		
	//calling inner class with making outer class object
		Outer.Inner obj1 = obj. new Inner();
		obj1.m1();
	}
}
