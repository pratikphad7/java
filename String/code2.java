class stringDemo1{
	public static void main(String[] a){
		//concat method
	
		String str="core2";
		System.out.println(str.concat("web"));

		//length

		System.out.println("length=" + str.length());	

		//charAt

		System.out.println("char at = "+ str.charAt(2));

		//compareTo
		
		String str1="Web";
		System.out.println("compare to = "+ str.compareTo(str1));

		//compareToIgnore
		
		System.out.println("Compare to Ignore = "+ str.compareToIgnoreCase(str1));

		//equals

		System.out.println("equals ="+ str.equals(str1));

		//equalsIgnoreCase
		
		System.out.println("equalsIgnore case ="+ str.equalsIgnoreCase(str1));
		
		//indexOf
		System.out.println("endex of o from 0="+ str.indexOf('o',0));
		System.out.println("endex of o from 1="+ str.indexOf('o',1));
		System.out.println("endex of o from 2="+ str.indexOf('o',2));

		//lastindexOf
		System.out.println("lastendex of o from 0="+ str.indexOf('o',0));
		System.out.println("lastendex of o from 1="+ str.indexOf('o',1));
		System.out.println("lastendex of o from 2="+ str.indexOf('o',2));

		//replace

		System.out.println("replace="+ str.replace('c','C'));

		//Substring
		
		System.out.println("substring="+str.substring(3));
		System.out.println("subString="+str.substring(0,3));
	}

}
