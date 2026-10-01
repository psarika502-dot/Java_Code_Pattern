public class StringInsert1 {
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("Hello");
        sb.insert(1, 'w');
        System.out.println(sb);
        sb.insert(4,'r');
        System.out.println(sb);
    }
    
}
