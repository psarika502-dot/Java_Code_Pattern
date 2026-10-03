package Pattern;

public class PrimaryDiagonalSolidTriangle {
    public static void main(String[]args){
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i==j || j==1 || i==n)
                    System.out.print("* ");
                    else if(i-j == 1 || i-j==2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
