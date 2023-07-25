//Inner class and main method in same class

class Demo{
	class Inner{
		void fun(){
			System.out.println("In fun");
		}
	}

	void gun(){
		System.out.println("In gun");
	}

	public static void main(String args[]){
		Demo obj = new Demo();
		obj.gun();

		Inner obj1 = obj.new Inner();
		obj1.fun();
	}
}
