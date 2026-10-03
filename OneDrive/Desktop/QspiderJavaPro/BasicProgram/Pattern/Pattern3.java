package Pattern;

public class Pattern3 {
    public static void main(String[] args){
        int num = 7;
        for(int i = 1; i< num*2; i++){
            for(int j = 1; j <= num; j++){
                if(i+j <num*2-1 && i-j>=0){
                    System.out.print("* ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
