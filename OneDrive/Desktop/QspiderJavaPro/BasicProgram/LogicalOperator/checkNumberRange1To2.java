package LogicalOperator;

public class checkNumberRange1To2 {
    public static boolean checkNumber(int x){
        boolean result = x >= 1 && x <= 50 ? true: false;
        return result;
    }
    public static void main(String[]args){
       boolean result= checkNumber(55);
       System.out.println(result);

    }
}
