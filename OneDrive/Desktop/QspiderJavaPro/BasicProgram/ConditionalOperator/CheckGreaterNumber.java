package ConditionalOperator;

import java.util.Scanner;

public class CheckGreaterNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number first: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number Second: ");
        int num2 = sc.nextInt();
        System.out.println(" Greates Number: "+findGreatestNumber(num1,num2));
    }
    //check greates number
    public static String findGreatestNumber(int a, int b){
        return a>b? " "+a: " "+b;
    }
}
