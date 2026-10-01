public class StringInterning1 {
    public static void main(String []args){
        String str="Hello";
        String gtr=new String("Hello"); //interning avoid
        System.out.println(str);
        System.out.println(gtr);
    }
    
}
