import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(18<age){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
    
}
