class Pattern{
    public static void main(String[] args) {
        int m=6;
        int n=5;
        int i,j;
        //inner loop
        for(i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                //loop if statement for star print 
                if(i==1|| j==1 || i==m || j==n){
                    System.out.print("*");
                }
                //else statement for space print
                else{
                    System.out.print(" ");
                }
            }System.out.println("");

        }
    }
}