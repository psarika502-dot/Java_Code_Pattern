import java.util.Scanner;

public class Calculation1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("There is calculator");
        int result;
        int operator;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        switch(operator){
            case 1: result=a+b;
            System.out.println(+a+" + "+b+" =");
            break;


        }

        

        
    }
    
}
