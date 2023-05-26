import java.io.*;

class Demo{
	int y=10;
	int fun(int x){
		System.out.println(x);
		return x;
	}
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int val=Integer.parseInt(br.readLine());
		System.out.println(val);
		
		char ch=(char)br.read();
		System.out.println(ch);
		br.skip(1);

		int x=Integer.parseInt(br.readLine());
		System.out.println(x);
		Demo obj=new Demo();
		int z=obj.fun(10);
		System.out.println("z="+z);
		System.out.println(obj.y);

	}
}
