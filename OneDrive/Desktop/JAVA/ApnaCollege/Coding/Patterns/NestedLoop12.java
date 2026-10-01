public class NestedLoop12 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int j;
        //for outer loop
        for(i=1;i<=n;i++){
            //for inner loop-->space 
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for inner loop-->star
            for(j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println("");
        }
    
}
    
}
