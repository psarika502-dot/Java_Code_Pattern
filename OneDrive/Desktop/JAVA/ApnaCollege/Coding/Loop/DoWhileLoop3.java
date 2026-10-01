import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
       
        do{
            if(marks>=90){
                System.out.println("This is good");
            }
            else if(marks>=60){
                if(marks<=89)
                System.out.println("This is also good");
            }
            else{
                System.out.println("This is good as well");
            }
        }while(marks<=1);
    }
    
}
