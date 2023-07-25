//finding thread name


class Mythread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public void start(){   			//don't override start method because then it work as normal 						          method, it will not use multithreading
		System.out.println("In start");
		run();
	}
}

class main{
	public static void main(String args[]){
		Mythread obj = new Mythread();

		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}
