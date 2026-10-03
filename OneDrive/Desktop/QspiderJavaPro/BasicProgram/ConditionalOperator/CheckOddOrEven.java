package ConditionalOperator;

public class CheckOddOrEven {
    public static void main(String[]args){
        int num = 101;
        System.out.println(isOddOrEven(num));
    }
    //to check odd or even
    public static String isOddOrEven(int num){
        return num%2 == 0? "even": "odd";
    }
}
