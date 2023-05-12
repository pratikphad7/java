class StringDemo{
	public static void main(String[] a){
		String str="Core2Web";  //on string constant pool
		String str1=new String("Core2Web");  //on heap
		char str2[]={'C','o','r','e','2','w','e','b'}; //on heap
		String str3="Core2Web";  // on scp And same add. of str
					 
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		//identity hash code
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));


	}
} 
