public class NestedLoop25 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print-->row no. and row no. times
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    
}
