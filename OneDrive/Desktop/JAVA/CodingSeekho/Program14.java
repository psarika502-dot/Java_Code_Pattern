class Test10
{
private static int x;
static void fun1()
{
System.out.println(x);
}
void fun2()
{
x=55;
}
static void fun4()
{
x=3;
}
}
class Program14
{
public static void main(String []args)
{
Test10.fun4();
Test10.fun1();
}
}