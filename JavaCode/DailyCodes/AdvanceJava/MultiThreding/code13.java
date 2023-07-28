//ThreadGroup


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
		ThreadGroup obj = new ThreadGroup("Core2Web");

		myThreadGroup tg1 = new myThreadGroup(obj,"Thread1");
		myThreadGroup tg2 = new myThreadGroup(obj,"Thread2");

		tg1.start();
		tg2.start();

		System.out.println(Thread.currentThread());

	}
}
