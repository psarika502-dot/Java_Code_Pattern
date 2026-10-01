public class StringImmutable {
    public static void main(String[] args) {
        String s="Hello"; //we can print Heylo
        s=s.substring(0,2)+'y'+s.substring(3,5);
        System.out.println(s);
    }
    
}
