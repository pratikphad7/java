import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.Exception{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

				sum=sum+arr[i];
		}

		System.out.println(sum);
	}
}
