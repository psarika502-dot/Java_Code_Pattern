import java.util.Scanner;

public class NestedLoop5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n=sc.nextInt();
        System.out.println("Enter second number");
        int m=sc.nextInt();
        int i;
        int j;
        //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
