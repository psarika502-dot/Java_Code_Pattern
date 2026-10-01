public class NestedLoop18 {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        int num=10;
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print(num);
                num--;
                
            }
            System.out.println("");
        }
    }
    
}
