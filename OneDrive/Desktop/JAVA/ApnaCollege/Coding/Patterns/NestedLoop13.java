public class NestedLoop13 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        for(i=n;i>=1;i--){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
