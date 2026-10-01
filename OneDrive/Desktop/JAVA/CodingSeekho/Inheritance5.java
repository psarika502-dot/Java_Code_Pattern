class Test1
{
int x;
int y;
void fun1()
{
System.out.println("first parent function is executed");
}
Test1(int p,int q)
{
x=p;
y=q;
System.out.println(x);
System.out.println(y);
}
}
class Test2 extends Test1
{
int z;
Test2()
{
super(33,77);
System.out.println("first child class is executed");
}
}
class Inheritance5
{
public static void main(String []args)
{
Test2 t1=new Test2();
}
}