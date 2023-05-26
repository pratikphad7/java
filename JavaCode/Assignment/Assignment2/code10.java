import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.IOException{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		 
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		
		
		for(int i=0;i<arr.length;i++){
			int no=arr[i];
			int sum=0;
			while(no>0){
				sum=(no%10)+sum;
				no=no/10;
			}

			if(sum%2==0){
				System.out.println(arr[i]);
			}
		}

	}
}
