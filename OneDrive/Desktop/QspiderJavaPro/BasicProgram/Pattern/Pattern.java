package Pattern;

public class Pattern {
    public static void main(String[]args){
        int num = 4;
        for(int i = 1; i<= num; i++){
            for(int j = 1; j < num*2; j++){
                if(i+j< num*2+1 && i-j<=0){
                    System.out.print("*" +" ");
                }
                else{
             ;;;       System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
