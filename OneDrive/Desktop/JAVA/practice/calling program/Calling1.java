class Object1
{
static int x;
static int y;
static void fun1()
{
System.out.println("first function is executed");
}
static void fun2()
{
System.out.println("second function is executed");
}
}
class Calling1
{
public static void main(String []args)
{
System.out.println("main program is successfully run");
Object1.fun1();
Object1.fun2();
Object1.x=55;
Object1.y=22;
System.out.println(Object1.x);
System.out.println(Object1.y);
}
}


