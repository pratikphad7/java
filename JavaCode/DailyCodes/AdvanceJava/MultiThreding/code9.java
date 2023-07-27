//join method


class JoinDemo extends Thread{
	public void run(){
		for(int i=0;i<9;i++){
			System.out.println("In run");
		}
	}
}

class main{
	public static void main(String args[]){
		JoinDemo obj = new  JoinDemo();
		obj.start();
		
		try{
			obj.join();
		}catch(InterruptedException IE){
		
		}

		for(int i=0; i<10;i++){
			System.out.println("In main");
		}
	}
}


