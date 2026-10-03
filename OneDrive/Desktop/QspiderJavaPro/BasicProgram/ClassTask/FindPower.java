package ClassTask;

import java.util.Scanner;

public class FindPower {
    static void power(int m) {
        int power = 1;
        for (int i = 1; i <= m; i++) {
            power = power*2;
//            power++;
            System.out.println(power);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FindPower.power(n);
        }
    }

