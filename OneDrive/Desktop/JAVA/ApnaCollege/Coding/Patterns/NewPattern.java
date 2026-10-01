import java.util.Scanner;
class NewPattern{
    public static void main(String[] args) {
        try {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
              for(int i=1;i<=n;i++){
            //spaint ces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println("");
        }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("please enter number");
        }
    }
}