import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter sencond number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        if(a>b)
        if(a>c)
        System.out.println("greatest "+a);
        if(b>a)
        if(b>c)
        System.out.println("greatest "+b);
        if(c>a)
        if(c>b)
        System.out.println("greatest "+c);
    }
    
}
