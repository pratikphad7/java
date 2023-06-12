class Core2Web{

	Core2Web(){  //after creation of object compiler implicitly call to constroctor
		System.out.println("In Core2Web constroctor");
	}

	int x=10;

	public static void main(String[] args){
		System.out.println("In main");

		Core2Web obj=new Core2Web();  //creation of object of class core2web
	
	}
}
