public class StringBuilder6 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("racecar");
        sb.reverse();
        if(sb==sb.reverse()){
            System.out.println("true"); 
        }else{
            System.out.println(false);
        }
    }
    
}                   
