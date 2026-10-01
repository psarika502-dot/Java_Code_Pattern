public class NestedLoop17 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        int number=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;//number=number+1;
            }System.out.println("");
        }

    }
    
}
