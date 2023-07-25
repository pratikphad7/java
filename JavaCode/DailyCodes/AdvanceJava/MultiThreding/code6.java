//multithreding using runable interface

class MyThrad implements Runnable{
	public void run(){
		System.out.println("In run");
	}

}

class main{
	public static void main(String args[]){
		MyThrad obj = new MyThrad();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
