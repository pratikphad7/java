//priority of thread

class Mythread extends Thread{
	public void run(){
		
		Thread t = Thread.currentThread();
		System.out.println(t);		//[thread grp,priority,thradName]
		System.out.println(t.getPriority());
	}
}

class main{
	public static void main(String args[]){
		Mythread obj = new Mythread();
		obj.start();

		Thread t = Thread.currentThread();
		System.out.println(t);		//[thread Name,priority,thread grp]
		System.out.println(t.getPriority());

		t.setPriority(9);
		System.out.println(t);		//[thread Name,priority,thread grp]
	}
}
