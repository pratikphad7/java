class IPL{
	private String name=null;
	IPL(String name){
		this.name=name;
		System.out.println(System.identityHashCode(this.name));
	}
}

class client{
	public static void main(String args[]){
		IPL demo=new IPL("Virat");
		IPL demo1=new IPL("Virat");
	}
}
