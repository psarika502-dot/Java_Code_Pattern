package LogicalOperator;

public class FindLargestNumber {
    public static int largestNumber(int x, int y){
//        int result = 0;
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String []args){
        int result = largestNumber(5,4);
        System.out.println("Largest Number: "+result);
    }
}
