import java.io.*;

class Demo{
	public static void main(String[] args) throws java.io.IOException{
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader obj1=new BufferedReader(obj);

		System.out.println("Enter Name");
		String name=obj1.readLine();


		System.out.println("Enter age");
		int age=Integer.parseInt(obj1.readLine());
		
		System.out.println(name);
		System.out.println("age="+age);

		int num=obj.read();
		System.out.println("num="+num);

	}
}
