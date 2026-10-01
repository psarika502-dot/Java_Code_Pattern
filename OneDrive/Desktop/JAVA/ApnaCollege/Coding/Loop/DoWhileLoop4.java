import java.util.Scanner;

public class DoWhileLoop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do{
            if(n/n==1){
                System.out.println(n);
            }
            else{
                System.out.println("This is not prime number");
            }
        }while(n<=1);

    }
    
}
