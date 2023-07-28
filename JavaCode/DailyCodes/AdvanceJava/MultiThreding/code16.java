//ThreadPool

import java.util.concurrent.*;

class Demo implements Runnable{
	int num;
	Demo(int num){
		this.num=num;
	}

	public void run(){
		System.out.println(Thread.currentThread() + "Start");
		task();
		System.out.println(Thread.currentThread() + "End");
	}

	public void task(){
		try{
			Thread.sleep(5000);
		}catch(Exception ie){
		
		}
	}
}

class main{
	public static void main(String arg[]){
		ExecutorService es = Executors.newCachedThreadPool();

		for(int i=0;i<10;i++){
			Demo obj = new Demo(i);
			es.execute(obj);
		}
	}
}
