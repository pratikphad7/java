class ArmStr{
	public static void main(String[] args){
		int no=25;
		int temp=no;
		count=0;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		int sum=0;
		temp=no;
		while(temp!=0){	
			int rem=temp%10;
			for(int i=0;i<count;i++){
				rem=rem*rem;
			}	
		}
		
	}
}
