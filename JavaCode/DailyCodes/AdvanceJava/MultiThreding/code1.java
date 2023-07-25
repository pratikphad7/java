class MyThread extends Thread{
	public void run(){					//run is alwase public because in thread class  								  it is public, and we override it in our class 								  hence it alwse public else it will be gave    								  error weaker privillege access
		for(int i=0;i<100;i++){
			System.out.println("In Run");
		}
	}
}

class main{
	public static void main(String args[]){
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0;i<100;i++){
			System.out.println("In main");
		}
	}
}
