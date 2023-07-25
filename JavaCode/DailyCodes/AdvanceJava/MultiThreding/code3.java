//finding thread name


class Mythread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class main{
	public static void main(String args[]){
		Mythread obj = new Mythread();

		obj.start();

		System.out.println(Thread.currentThread().getName());
	}
}
