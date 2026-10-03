package LogicalOperator;

public class AndOperator {
    public static void andOperator(int y ){
//        int x = 345;
        //only check the the 3 and 5 divisible or not otherwise zero
        boolean result = (y % 3 == 0) && (y % 5==0);
        System.out.print(result);
    }
    public static void main(String []args){
        andOperator(33);
    }
}
