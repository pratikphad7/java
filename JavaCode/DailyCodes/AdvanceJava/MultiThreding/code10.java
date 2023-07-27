//Deadlock condition with joining both functions

class JoinDemo extends Thread{
	static Thread nm=null;

	public void run(){

		try{
			nm.join();
		}catch(InterruptedException Ie){
		
		}

		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}

class main{
	public static void main(String a[])throws InterruptedException{
		JoinDemo.nm=Thread.currentThread();
		
		JoinDemo obj = new JoinDemo();
		obj.start();

		obj.join();

		for(int i=0; i<10;i++){
			System.out.println("In main");
		}
	}
}
