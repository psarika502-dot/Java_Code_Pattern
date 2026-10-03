package LogicalOperator;

public class CheckVowlesOrNot {
    public static boolean checkVowels(char ch){
        boolean result = (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')? true : false;
        return result;
    }
    public static void main(String [] args){
        boolean result = checkVowels('A');
        System.out.println(result);
    }
}
