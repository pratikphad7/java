import java.io.*;

class Array{
	public static void main(String[] a){
		InputStreamReade x=new InputStreamReder(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[size];
		int product=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2!=0){
				product=product*arr[i];
			}
		}

		System.out.println(sum);
	}
}
