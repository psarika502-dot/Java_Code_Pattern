class Test8
{
int x;
private static int y;
void fun1()
{
y=22;
}
void fun2()
{
System.out.println(y);
}
void fun3()
{
y=5;
}
}
class Program12
{
public static void main(String args[])
{
Test8 t1=new Test8();
Test8 t2=new Test8();
t1.fun1();
t2.fun3();
t1.fun2();
}
}

  