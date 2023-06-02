class Employee{
	int ID=10;
	String name="Kanha";

	static int y=50;

	Employee(){
		System.out.println("ID="+ID);
		System.out.println("name="+name);
		System.out.println("y="+y);
	} 
}

class Client{
	public static void main(String args[]){
		Employee obj=new Employee();
		System.out.println("_______________________");
		Employee obj1=new Employee();

		obj1.ID=10;
		obj1.name="Rahul";
		obj1.y=500;
		System.out.println("ID="+obj1.ID);
		System.out.println("name="+obj1.name);
		System.out.println("y="+obj1.y);		
		System.out.println("_______________________");
		System.out.println("ID="+obj.ID);
		System.out.println("name="+obj.name);
		System.out.println("y="+obj.y);		
	}
}
