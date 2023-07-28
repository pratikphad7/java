//ChildThreadGroup

class myThreadGroup extends Thread{ 
	myThreadGroup(ThreadGroup tg,String str){
		super(tg,str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class main{
	public static void main(String args[]){
		ThreadGroup tg = new ThreadGroup("India");

		myThreadGroup t1 = new myThreadGroup(tg,"Maha");
		myThreadGroup t2 = new myThreadGroup(tg,"Goa");

		t1.start();
		t2.start();

		ThreadGroup ctg = new ThreadGroup(tg,"Pakistan");
		myThreadGroup t3 = new myThreadGroup(ctg,"IslamaBad");
		myThreadGroup t4 = new myThreadGroup(ctg,"Karachi");

		t3.start();
		t4.start();
		
		ThreadGroup ctg2 = new ThreadGroup(tg,"Bangladesh");
		myThreadGroup t5 = new myThreadGroup(ctg,"Mirpur");
		myThreadGroup t6 = new myThreadGroup(ctg,"xyz");
		t5.start();
		t6.start();

		tg.interrupt();

		System.out.println(tg.activeCount());
		System.out.println(tg.activeGroupCount());
	}
}
