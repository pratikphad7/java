import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.IOException{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int arr1[]=new int[size];
		 
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());

		}

		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i]!=arr1[j]){
					System.out.println(arr[i]);
				}
			}
		}

	}
}
