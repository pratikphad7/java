import java.util.Scanner;

class Input{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);

		
		System.out.println("Enter name");
		String name=obj.next();
		
		System.out.println("Enter age");
		int age=obj.nextInt();
		
		System.out.println("Enter package");
		float pack=obj.nextFloat();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(pack);
	}
}
