package Pattern;

public class HalloSquare {
    public static void main(String[]args){
        int n = 4;
        //outer loop will be used for row
        for(int i = 1; i <= n; i++){
            //inner loop will be used for column
            for(int j = 1; j<= n; j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
