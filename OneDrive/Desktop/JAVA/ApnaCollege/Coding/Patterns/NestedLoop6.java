public class NestedLoop6 {
    public static void main(String[] args) {
        int m=4;
        int n=5;
        int i;
        int j;
        //outer loop
        for(i=1;i<=m;i++){
            //inner loop
            for(j=1;j<=n;j++){
                if(i==1 || j==1 || i==m || j==n){
                    //cell--.(i,j)
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
            }
              System.out.println();  
        }
    
    }
    
}
