import java.io.*;

class Array{
	public static void main(String[] a)throws java.io.IOException{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		 
		System.out.println("Enter to search\n");
		int no;
		no=Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		int i;
		for(i=0;i<arr.length;i++){
			if(no==arr[i]){
				break;
			}
		}

		System.out.println(i);
	}
}
