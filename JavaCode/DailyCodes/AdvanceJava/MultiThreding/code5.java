//class Mythread

class Mythread extends Thread{
	Mythread(Mythread1 obj){
		obj.start();
	}

	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class Mythread1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

}

class main{
	public static void main(String args[]){
		Mythread1 obj1 = new Mythread1();
		Mythread obj = new Mythread(obj1);
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}
