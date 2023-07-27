//Thread Group

class myThread extends Thread{
	myThread(String str){
		super(str);
	}

	public void run(){
		System.out.println(getName());
	}
}

class main{
	public static void main(String args[]){
		myThread obj = new myThread("Core2Web");
		obj.start();

		System.out.println(Thread.currentThread().getName());

	}
}
