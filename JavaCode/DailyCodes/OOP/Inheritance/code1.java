class parent{
	int x=10;
	parent(){
		System.out.println("In parent constroctor");
	}

	void access(){
		System.out.println("parent Instance");
	}
}

class child extends parent{
	int y=20;
	child(){
		System.out.println("In child constroctor");
	}
}

class client{
	public static void main(String args[]){
		child obj=new child();
		obj.access();
	}
}
