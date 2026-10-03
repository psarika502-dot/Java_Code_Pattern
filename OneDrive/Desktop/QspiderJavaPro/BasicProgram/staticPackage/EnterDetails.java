package staticPackage;

import java.util.Scanner;

public class EnterDetails {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id: ");
        int sid = sc.nextInt();
        System.out.println("Enter Student Name: ");
//        String name = sc.next();
//        System.out.print(name);
        String value = sc.nextLine();
        System.out.println(value);
        sc.close();
    }
}
