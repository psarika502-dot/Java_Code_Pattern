package DataType;

class LocalVariable2{
	public static void main(String []args){
		int num1 = 45;
		System.out.println(num1); //45
		num1=33;
		{
			int num2 = 48;
			System.out.println(48); //48
			System.out.println(num1); //33
		}
	}
}