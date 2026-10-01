class Test5
{
int x;
int y;
void display1()
{
x=5;
}
void display2()
{
System.out.println("y");
}
}
class Program8
{
public static void main(String args[])
{
System.out.println("hello");
Test5 t1=new Test5();
t1.display1();
t1.display2();
t1.x=44;
System.out.println(t1.y);
}
}