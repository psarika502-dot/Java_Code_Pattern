public class NestedLoop22 {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        //upeer half
        for(i=1;i<=n;i++){
            //--.first part
            for(j=1;j<=i;j++){
                System.out.print("*");

            }//spaces
            int spaces = 2 *  (n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //for sencond part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        } //lower half
        for(i=n;i>=1;i--){
            //--.first part
            for(j=1;j<=i;j++){
                System.out.print("*");

            }//spaces
            int spaces = 2 *  (n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //for sencond part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
