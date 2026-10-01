public class NestedLoop21 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(j=i;j<=i;j++){
                System.out.print(i+"");
            }System.out.println("");
        }
    }
}
