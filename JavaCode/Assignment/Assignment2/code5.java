import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.IOException{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		 
		System.out.println("Enter to search\n");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		int no=arr[i]
		for(int i=1;i<arr.length;i++){
			if(no>arr[i]){
				no=arr[i];
			}
		}

		System.out.println(no);
	}
}
