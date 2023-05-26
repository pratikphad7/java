class AutoMOrfic{
	public static void main(String[] args){
		int no=76;
		int Sqr=no*no;
		int rem=0;
		int x=1;
		int flag=0;
		while(Sqr>0){
			
			rem=((Sqr%10)*x)+rem;
			x=x*10;

			if(rem==no){
				System.out.println("Automorphic");
				break;
			}

			Sqr=Sqr/10;
		}
		if(flag==0)
			System.out.println("Not Automorphic");

		/*
		int x=25;
		int y=x;
		int sq=x*x;
		int temp=1;
		while(x!=0){
			temp=10*temp;
			x/=10;
		}
		if(sq%temp == y){
			System.out.println("Automorphic");
		}else{
			System.out.println("Not Automorphic");
		}*/
	}

	
}
