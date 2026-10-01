import java.util.Scanner;

public class ForLoop6 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<=n;i++){
            sum=i+1;
        }
        System.out.println(sum);
    }
    
}
