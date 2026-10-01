public class StringBuilder3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sarikha");
        sb.insert(0, 'p');
        System.out.println(sb);
        sb.insert(3, 'i');
        System.out.println(sb);
        //delete 
        sb.delete(0,1);
        System.out.println(sb);
        
    }
    
}
