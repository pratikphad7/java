//Normal Inner class

class Outer{
	class Inner{
		void m1(){
			System.out.println("In inner m1");
		}
	}

}

class main{
	public static void main(String args[]){
		
	//calling Inner class without making Outer class object
		Outer.Inner obj1 = new Outer(). new Inner();	
		obj1.m1();
	}
}
