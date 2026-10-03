package LogicalOperator;

public class CheckAlphabetUpperOrLower {
    public static boolean checkUpperOrNot(char ch){
        boolean result = (ch >= 'A' && ch <= 'z') || (ch>= 'a' && ch <= 'z') ? true: false;
        return result;
    }
    public static void main(String[]args){
        boolean result = checkUpperOrNot('0');
        System.out.println(result);
    }
}
