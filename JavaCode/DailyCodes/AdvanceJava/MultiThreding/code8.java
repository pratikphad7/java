//sleep method

class sleepDemo extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class main{
	public static void main(String args[])throws InterruptedException{

		System.out.println(Thread.currentThread());

		sleepDemo obj = new sleepDemo();
		obj.start();

		Thread.sleep(1000,10);

		Thread.currentThread().setName("Core2Web");

		System.out.println(Thread.currentThread());
	}
}
