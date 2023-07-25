//Method Local inner class

class Outer{
	void m1(){
		System.out.println("In m1-Outer");

		class Inner{
			void m2(){
				System.out.println("In m2-Inner");
			}
		}

		Inner obj = new Inner();
		obj.m2();
	}

	public static void main(String args[]){
		Outer obj = new Outer();
		obj.m1();
	}
}
