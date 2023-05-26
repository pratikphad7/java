import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.IOExeception{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				even=even+arr[i];
			}else{
				odd=odd+arr[i];
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}
}
