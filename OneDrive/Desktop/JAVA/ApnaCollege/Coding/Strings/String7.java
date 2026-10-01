import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String  lastName=sc.nextLine();
        String fullName=name+""+lastName;
        //charAt we can used to one by one character are used
        for(int i=0;i<fullName.length();i++)
        System.out.println(fullName.charAt(i));
        }
}
