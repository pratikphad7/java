import java.io.*;

class Array{
	public static void main(String[] a)throws IOException{
		InputStreamReade x=new InputStreamReder(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%5==0){
				System.out.println(sum);
				
			}
		}

		//System.out.println(sum);
	}
}
