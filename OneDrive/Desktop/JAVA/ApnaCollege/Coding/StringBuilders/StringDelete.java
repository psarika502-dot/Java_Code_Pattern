public class StringDelete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sarikha");
        sb.delete(2, 4);
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
    }
}
