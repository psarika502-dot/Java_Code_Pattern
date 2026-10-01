public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sarikha");
        //charAt is used to find number of character
        System.out.println(sb.charAt(0));
        //setCharAt to replace the value the 
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }
    
}
