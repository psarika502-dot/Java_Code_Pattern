import java.util.Scanner;

public class First{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("This is the Positive Number");
        }
        else if(n<0){
            System.out.println("This is the Negative Number");
        }
        else{
            System.out.println("This is the Zero Number");
        }
    }
}