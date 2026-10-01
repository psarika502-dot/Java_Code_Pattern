class A
{
int x,y;
static void fun1()
{
System.out.println("fun1");
}
}
class B extends A
{
static void fun2()
{
System.out.println("hii");
System.out.println("byy");
}
}
class Inheritance1
{
public static void main(String []args)
{
B.fun1();
A.fun1();
B.fun2();
B.fun2();
}
} //output become
    fun1
    fun1
    hii
    byy
    hii
    byy