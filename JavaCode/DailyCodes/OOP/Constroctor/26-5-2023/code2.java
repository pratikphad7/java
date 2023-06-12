//seter gater

class Player{
	private int jerNo=0;
	private String playerName=null;

	Player(int jerNo,String playerName){
		this.jerNo=jerNo;
		this.playerName=playerName;
	}

	void getname(){
		System.out.println(jerNo);
		System.out.println(playerName);
	}
}

class client{
	public static void main(String args[]){
		Player obj=new Player(7,"msd");
		Player obj1=new Player(77,"pant");
		obj.getname();
		obj1.getname();
	}
}
