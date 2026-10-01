import java.util.Scanner;

public class ForLoop10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        if(i%2==0)
        System.out.println(i);
    }
    
}
