//static Inner class

class Outer{
	
	void m1(){
		System.out.println("In Outer-m1");
	}

	static class Inner{
		void m2(){
			System.out.println("In Inner-m2");
		}
	}
}

class Main{
	public static void main(String args[]){
		Outer.Inner obj = new Outer.Inner();
		obj.m2();
	}
}
