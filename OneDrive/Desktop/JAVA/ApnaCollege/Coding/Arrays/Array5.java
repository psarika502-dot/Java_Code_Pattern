import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int number[]=new int[marks];
        //input 
        for(int i=0;i<marks;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<marks;i++){
            System.out.println(number[i]);
        } 
    }
    
}
