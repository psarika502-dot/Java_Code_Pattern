package DataType;

class LocalVariable1{
	public static void main(String []args){
		int a = 45;
		int b = 66;
			
		System.out.println(a); //45
		System.out.println(b); //66
		
		a = 39;
 		System.out.println(a); //39
		
		{
			int x = 33;
			System.out.println(x); //33
			System.out.println(a); //39
		}
		//System.out.println(x); //CTE
		  System.out.println(b); //66;

}
}