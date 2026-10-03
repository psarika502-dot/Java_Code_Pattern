package staticPackage;

class Variable{
    //static variable
    static int num1;
    static double num2 = 18.5;
    static String name = "sarikha";
    static boolean israning= true;
   public static void function() {
        System.out.println(num2); //18.5
        num2 = 77.5;
        System.out.println(num2);
    }
}
public class StaticVariable2 {
    public static void main(String[]args){
        System.out.println(Variable.num1);
        Variable.function();
        System.out.println(Variable.name);
        System.out.println(Variable.israning);
    }
}
