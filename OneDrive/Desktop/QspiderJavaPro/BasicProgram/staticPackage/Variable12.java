package staticPackage;

class Static12 {
    //static variable
    static int a = 11;
    static int b = 12;
    static int c = a + b;

     static void add() {
        System.out.println(c);
    }
}
class StaticVariable1 {
    public static void main(String[]args) {
        Static12.add();
    }
    }

