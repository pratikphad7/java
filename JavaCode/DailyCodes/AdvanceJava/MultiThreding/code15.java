//ThreadGroup using runable interface

class myThreadGroup implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class main{
	public static void main(String a[]){
		ThreadGroup tg = new ThreadGroup("India");

		myThreadGroup obj1 = new myThreadGroup();
		Thread t1 = new Thread(tg,obj1,"Maha");

		myThreadGroup obj2 = new myThreadGroup();
		Thread t2 = new Thread(tg,obj2,"Goa");

		ThreadGroup ctg = new ThreadGroup(tg,"Pakistan");
		myThreadGroup obj3 = new myThreadGroup();
		Thread t3 = new Thread(ctg,obj3,"Karachi");
		
		myThreadGroup obj4 = new myThreadGroup();
		Thread t4 = new Thread(ctg,obj4,"Lahor");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
