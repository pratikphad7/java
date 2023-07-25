import java.util.Scanner;

class DataUnderFlowException extends RuntimeException{
	DataUnderFlowException(String msg){
		super(msg);
	}
}

class DataOverFlowException extends RuntimeException{
	DataOverFlowException(String msg){
		super(msg);
	}

}

class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];

		for(int i=0;i<arr.length;i++){
			int data=sc.nextInt();

			if(data < 0){
				throw new DataUnderFlowException("Data under flow");
			}
			
			if(data > 100){
				
				throw new DataOverFlowException("Data over flow");
				
			}
		}

	}
}
