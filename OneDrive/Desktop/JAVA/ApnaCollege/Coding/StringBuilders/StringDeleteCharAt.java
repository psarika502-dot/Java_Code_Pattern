class StringDeleteCharAt{
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("Hello");
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}