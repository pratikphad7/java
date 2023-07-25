//try,catch

class Demo{
	public static void main(String args[]){
		System.out.println("Start main");
		
		try{
			System.out.println(10/0);
		}catch(ArithmeticException x){
			System.out.println("Exception handled");
		}

		System.out.println("End main");
	}
}
