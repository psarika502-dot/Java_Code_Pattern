class Test9
{
private int x;
void fun1()
{
x=5;
}
void fun2()
{
System.out.println(x);
}
}
class Program13
{
public static void main(String []args)
{
Test9 t1=new Test9();
t1.fun1();
t1.fun2();
}
}
