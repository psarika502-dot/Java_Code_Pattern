public class StringEqual1 {
    public static void main(String []args){
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2)); //equal used check address and String therefore used equal
    }
    
}
