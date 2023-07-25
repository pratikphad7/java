//finally block


class demo{
	void m1(){
	
	}

	void m2(){
	
	}

	public static void main(String args[]){
		demo obj=new demo();

		obj.m1();

		obj=null;

		try{
			obj.m2();
		}catch(NullPointerException np){
			System.out.println("Exception handeled");
		}finally{
			System.out.println("Connection closed");
		}
	}
}
