import java.io.*;

class Array{
	static int x=10;
	static void fun(int arr[],int N){
		for(int i=0;i<N;i++){
			System.out.println(arr[i]);
		}
		System.out.println(x);
	}
	public static void main(String[] args)throws java.io.IOException{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		//BufferedReader obj1=new BufferedReader(obj);


		int arr[]=new int[10];
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		fun(arr,arr.length);
	}
}
