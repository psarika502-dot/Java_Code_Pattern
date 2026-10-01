public class NestsedLoop7 {
    public static void main(String[] args) {
        int m=4;
        int n=5;
        int i;
        int j;
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }
            
            }
            System.out.println();
        }
    }
    
}
