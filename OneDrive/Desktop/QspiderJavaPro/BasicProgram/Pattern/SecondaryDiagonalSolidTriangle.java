package Pattern;

public class SecondaryDiagonalSolidTriangle {
    public static void main(String[]args){
        int n = 4;

        //outer loop will be used for print space
        for(int i = 1; i<=n; i++){
            //inner loop will be used for print star
            for(int j = 1; j<= n; j++){
                if(i==n || j==n ||i+j==5)
                    System.out.print("* ");
//                else if(i+j==5)
//                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
