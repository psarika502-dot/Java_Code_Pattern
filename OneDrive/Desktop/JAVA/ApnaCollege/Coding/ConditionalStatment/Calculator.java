import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();
        System.out.println(" 1: +(Addition)");
        System.out.println(" 2: -(Subtraction)");
        System.out.println(" 3: *(Multiplication)");
        System.out.println(" 4: /(Division)");
        System.out.println(" 5: %(Remainder)");
        int operator=sc.nextInt();
        double result;
        switch(operator){
            case 1 : 
            result=a+b;
            System.out.println("Addition: " +a +" + "+b+" = "+result);
            break;
            case 2 : 
            result=a-b;
            System.out.println("Subtraction: " +a +" - "+b+" = "+result);
            break;
            case 3 : 
            result=a*b;
            System.out.println("Multiplication: " +a +" * "+b+" = "+result);
            break;
            case 4 : 
            result=a+b;
            System.out.println("Division: " +a +" / "+b+" = "+result);
            break;
            case 5 : 
            result=a%b;
            System.out.println("Remainder: " +a +" % "+b+" = "+result);
            break;
            default : System.out.println("Invalid Operation");
        }

    }
    
}
