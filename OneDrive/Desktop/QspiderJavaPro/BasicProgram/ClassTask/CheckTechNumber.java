package ClassTask;

public class CheckTechNumber {
    public static void main(String []args){
        int num = 2025;
        boolean result= checkTechNumber(num);
        System.out.println(result);
    }
    public static boolean checkTechNumber(int num){
        int temp = num;
        int sum = 0;
        int square = 1;
        while(num!=0){
            int digit = num %100;
            sum += digit;
            square = sum * sum;
            num /= 100;

        }
       return temp==square;
    }
}
