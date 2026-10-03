package ClassTask;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("perfect Number "+num+" "+isPerfectNumber(num));
        sc.close();
    }
    //to check the perfect number or not
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum == num;
    }
}
