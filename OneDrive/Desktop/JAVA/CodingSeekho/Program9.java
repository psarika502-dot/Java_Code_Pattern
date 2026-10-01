class Test6
{
int x;
int y;
void fun1()
{
x=5;
}
void fun2()
{
System.out.println("y");
}
}
class Program9
{
public static void main(String args[])
{
System.out.println("Sarikha");
Test6 t1=new Test6();
t1.fun2();
t1.fun1();
t1.x=55;
System.out.println(t1.x);
}
}