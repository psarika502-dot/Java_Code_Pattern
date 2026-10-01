public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                int x=i+j;
                if(x%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }System.out.println("");
        }
    }

}
