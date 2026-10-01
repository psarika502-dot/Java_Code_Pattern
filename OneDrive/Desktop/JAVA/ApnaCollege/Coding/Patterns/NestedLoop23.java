public class NestedLoop23 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        //first part
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println("");
        }
    }
    
}
