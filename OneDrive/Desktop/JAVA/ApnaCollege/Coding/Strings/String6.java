import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        String fullName=firstName+" "+lastName;
        //find String length
        System.out.println(fullName.length());
    }
}
