class Demo1
{
int x,y;
Demo1()
{
System.out.println("first constructer is executed");
}
void fun1()
{
System.out.println("programme");
}
}
class Demo2 extends  Demo1
{
Demo2()
{
System.out.println("second constructor is executed");
}
}
class Inheritance4
{
public static void main(String []args)
{
System.out.println("main class is executed");
Demo2 d1=new Demo2();
}
}

