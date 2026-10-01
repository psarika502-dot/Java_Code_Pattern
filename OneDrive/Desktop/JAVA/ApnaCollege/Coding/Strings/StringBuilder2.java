public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sarikha");
        //insert is used  to add the value
        sb.insert(0, 'p');
        System.out.println(sb);//pSarikha
        //the below code 1 string patil and the the starting char of patil and ending cha of patil.
        sb.insert(0, "Ramchandra", 0, 3);
        System.out.println(sb); //output is patsarikha
        sb.insert(4, 'i');
        System.out.println(sb);
    }
    
}
