import java.util.Scanner;

public class HomeWork1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select an operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");
        int operation=sc.nextInt();
        double result;
        switch(operation){
           case 1:
            result=a+b;
            System.out.println("Result: " + a + "+" + b + " = "+result);
            break;
            case 2:
            result=a-b;
            System.out.println("Result: "+a +"-"+b +" = "+result);
            break;
            case 3:
            result=a*b;
            System.out.println("Result: "+a + "*" +b+" = "+result);
            break;
            case 4:
            result=a/b;
            System.out.println("Result: "+a +"/" +b+" = "+result);
            break;
            case 5:
            result=a%b;
            System.out.println("Result: "+a +"%" +b +" = "+result);
            break;
            default:
            System.out.println("invalid operation");


              
        }

    }
    
}
