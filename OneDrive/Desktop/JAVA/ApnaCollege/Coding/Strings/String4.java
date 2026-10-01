import java.util.Scanner;

public class String4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        //Concatination of two String 
        String fullName=firstName+" and "+lastName;
        System.out.println(fullName);
    }
}
