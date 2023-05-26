class Patern{
	
	public static void main(String[] args){
		int j=1;
		for(int i=1;i<=21;i++){
			for(;j<=j*j;j++){
				System.out.print(j +"\t");
				if(i%2==0&&(i*(i/2))+(i/2)==j){
					j++;
					break;
				}else if(i%2!=0&&i*((i+1)/2)==j){
					j++;
					break;
				}else if(i==1){
					j++;
					break;
				}
			}
			System.out.println();
		}
	}
}
