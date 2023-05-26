import java.io.*;

class Array{
	public static void main(String[] args)throws IOException{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader y=new BufferedReader(x);
		int size=Integer.parseInt(y.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(y.readLine());
		}

		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
