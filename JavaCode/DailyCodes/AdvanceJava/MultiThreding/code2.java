//multithreading using sleep systemcall

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run");

			try{
				Thread.sleep(1);
			}catch(InterruptedException Ie){
			
			}
		}
	}
}

class main{
	public static void main(String args[])throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();

		for(int i=0;i<10;i++){
			System.out.println("In main");
			Thread.sleep(1);
		}
	}
}
