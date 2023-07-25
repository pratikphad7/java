import java.io.*;

class ExceptionDemo{

		public static void main(String args[])throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println(str);

			int data=0;

			try{
				data=Integer.parseInt(br.readLine());
			}catch(NumberFormatException ae){
				System.out.println("Exception handled");
				data=Integer.parseInt(br.readLine());
			}
		}
}
