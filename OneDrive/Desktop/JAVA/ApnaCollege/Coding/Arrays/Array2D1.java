import java.util.Scanner;
public class Array2D1 {

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int [][] number=new int[rows][cols];
    //input
    //rows
    for(int i=0;i<rows;i++){
        //columns
        for(int j=0;j<cols;i++){
            number[i][j]=sc.nextInt();
        }
    }
    //output
    for(int i=0;i<rows;i++){
        //columns
        for(int j=0;j<cols;i++){
           System.out.println(number[i][j]+" ");
        }
        System.out.println();


   } 
 }
}
