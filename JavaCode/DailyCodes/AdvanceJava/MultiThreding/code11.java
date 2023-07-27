//yeild method


class mythread extends Thread{
	public void run(){
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class main{
	public static void main(String args[])throws InterruptedException{
		mythread obj = new mythread();
		obj.start();

		obj.yield();
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}	
}
